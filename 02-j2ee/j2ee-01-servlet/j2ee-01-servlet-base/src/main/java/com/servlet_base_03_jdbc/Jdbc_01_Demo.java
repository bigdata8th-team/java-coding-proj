package com._03_jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jdbc_01_Demo
 */
@WebServlet("/Jdbc_01_Demo")
public class Jdbc_01_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Jdbc_01_Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Jdbc_01_Demo");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String userName = request.getParameter("name");
		String pwd = request.getParameter("pwd");

		db_test(userName, pwd);

		// 响应
		PrintWriter pw = response.getWriter();
		pw.write("<p>恭喜你，JDBC测试成功！</p>");
		pw.flush();
		pw.close();
	}

	public static void db_test(String userName, String pwd) {
		PreparedStatement stat = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsr_data1", "root", "root");
			System.out.println("建立和数据库的连接");
			String sql = "select * from user_info u where u.`USER_NAME` = ? and u.`PASSWORD` = ?";
			stat = conn.prepareStatement(sql);
			stat.setString(1, userName);
			stat.setString(2, pwd);

			rs = stat.executeQuery();
			int count = rs.getMetaData().getColumnCount();
			for (int i = 1; i <= count; i++) {
				System.out.print(rs.getMetaData().getColumnName(i) + "\t");
			}
			System.out.println("");
			while (rs.next()) {
				System.out.println(rs.getString(4));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("未找到驱动类");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("sql操作异常");
			e1.printStackTrace();
		}
	}
}
