
package com._01_character;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Charset_01_Post
 */
/*
 * 注解，servlet通过遍历注解查找action指定路径对应的服务
 */
@WebServlet("/Charset_01_Post")
public class Charset_01_Post extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Charset_01_Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Charset_01_Post");
		System.out.println("request content type:" + request.getContentType());
		// post传送时，设置接受对象request的编码
		request.setCharacterEncoding("utf-8");

		// post传送时，设置响应对象response的编码
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		// 获得接收的数据，对应提交表单的name选项
		String userName = request.getParameter("name");
		String password = request.getParameter("pwd");

		System.out.println("用户名：" + userName + "\n密码：" + password);

		// 响应
		PrintWriter pw = response.getWriter();
		pw.write("<p>恭喜你，post测试成功！</p>");
		pw.write("<p>成功登陆！</p>");
		pw.flush();
		pw.close();
	}

}
