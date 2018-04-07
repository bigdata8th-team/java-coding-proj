package com._02_cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie_01_Set
 */
@WebServlet("/Cookie_02_Get")
public class Cookie_02_Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie_02_Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		/*
		 * 接收客户传来的cookie值
		 */
		/*
		 * 编码不是utf-8，可以转码
		 * URLDecoder.decode(cookie.getValue(),"utf-8")
		 */
		Cookie cookies[] = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.print(cookie.getName() + '\t');
			System.out.println(cookie.getValue());
		}
		
		response.sendRedirect("index.html");
	}

}
