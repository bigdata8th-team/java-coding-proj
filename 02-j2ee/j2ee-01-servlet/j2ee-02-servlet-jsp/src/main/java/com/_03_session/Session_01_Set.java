package com._03_session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session_01_Set
 */
@WebServlet("/Session_01_Set")
public class Session_01_Set extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session_01_Set() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Session_01_Set");
		
		//通过request获得session
		HttpSession session = request.getSession();
		
		//往session中装值
		session.setAttribute("sessionName", "hank");
		
		//往request中装值
		request.setAttribute("requestName", "hank");
		
		response.sendRedirect("index.html");
	}

}
