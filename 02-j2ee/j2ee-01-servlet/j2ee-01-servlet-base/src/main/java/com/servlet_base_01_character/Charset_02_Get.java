package com.servlet_base_01_character;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Charset_02_Get
 */
@WebServlet("/Charset_02_Get")
public class Charset_02_Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Charset_02_Get() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Charset_02_Get");
		System.out.println("request content type:" + request.getContentType());

		// get传送时，设置响应对象response的编码
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		// 获得接收的数据，对应提交表单的name选项
		String userName = request.getParameter("name");
		String password = request.getParameter("pwd");

		// get方式接收，设置数据编码字符集
		userName = new String(userName.getBytes("iso-8859-1"), "utf-8");

		System.out.println("用户名：" + userName + "\n密码：" + password);

		// 响应
		PrintWriter pw = response.getWriter();
		pw.write("<p>恭喜你，get测试成功！</p>");
		pw.write("<p>成功登陆！</p>");
		pw.flush();
		pw.close();
	}

}
