package com.servlet_base_06_lifecycle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lifecycle_01_Demo
 */
@WebServlet("/Lifecycle_01_Demo")
public class Lifecycle_01_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Lifecycle_01_Demo() {
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

	/*
	 * 就绪阶段，负责执行具体的业务
	 */

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Lifecycle_01_Demo");

		ServletConfig config = getServletConfig();
		String debug = config.getInitParameter("myDebug");
		System.out.println("初始化变量为：" + debug);

	}

	/*
	 * 初始化阶段
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		String debug = config.getInitParameter("myDebug");
		System.out.println("初始化方法中打印初始化变量：" + debug);
		super.init(config);
	}

	/*
	 * 销毁阶段
	 */
	@Override
	public void destroy() {
		System.out.println("调用destroy方法");
		super.destroy();
	}

}
