package com._02_request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request_01_OneParam
 */
@WebServlet("/Request_01_OneParam")
public class Request_01_OneParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Request_01_OneParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request_01_OneParam");
		// post传送
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		// 获得接收的数据，对应提交表单的name选项
		String sport = request.getParameter("sport");
		System.out.println("你最擅长的运动是：" + sport);

		// 响应
		PrintWriter pw = response.getWriter();
		pw.write("<p>恭喜你，接收单值测试成功！</p>");
		pw.flush();
		pw.close();
	}

}
