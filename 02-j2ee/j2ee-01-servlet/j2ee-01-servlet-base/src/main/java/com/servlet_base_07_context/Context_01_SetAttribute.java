package com.servlet_base_07_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Context_01_SetAttribute
 */
@WebServlet("/Context_01_SetAttribute")
public class Context_01_SetAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Context_01_SetAttribute() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**解耦
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Context_01_SetAttribute");

		/*
		 * WEB容器在启动时，它会为每个WEB应用程序都创建一个对应的ServletContext对象，
		 * 它代表当前web应用，是一个全局的环境变量。
		 */
		ServletContext sctx = getServletContext();//全局变量
		sctx.setAttribute("name", "hank");//map.put(key,value)
	}

}
