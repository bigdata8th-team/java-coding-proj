package com._02_cookie;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie_01_Set
 */
@WebServlet("/Cookie_01_Set")
public class Cookie_01_Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie_01_Set() {
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
		 * 后台程序发送cookie值
		 * 这个coookie值会被客户的浏览器保存，
		 * 客户下次向服务器请求，会附带该cookie值
		 */
		List<Cookie> list = new ArrayList<>();
		list.add(new Cookie("name", "hank"));
		list.add(new Cookie("age", "28"));
		list.add(new Cookie("height", "170"));
		list.add(new Cookie("look", "hansom"));
		list.add(new Cookie("money", URLEncoder.encode("poor", "utf-8")));

		for (Cookie cookie : list) {
			response.addCookie(cookie);
		}
		
		response.sendRedirect("index.html");
	}

}
