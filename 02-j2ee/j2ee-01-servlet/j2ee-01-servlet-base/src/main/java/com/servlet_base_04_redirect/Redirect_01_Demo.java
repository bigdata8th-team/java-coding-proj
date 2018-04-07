package com._04_redirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirect_01_Demo
 */
@WebServlet("/Redirect_01_Demo")
public class Redirect_01_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Redirect_01_Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Redirect_01_Demo");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		// 获得接收的数据，对应提交表单的name选项
		String userName = request.getParameter("name");
		String password = request.getParameter("pwd");

		System.out.println("用户名：" + userName + "\n密码：" + password);

		/*
		 * 使浏览器重新发起访问index.html的请求
		 */
		response.sendRedirect("index.html");
	}

}
