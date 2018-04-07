package com._03_session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session_02_Get
 */
@WebServlet("/Session_02_Get")
public class Session_02_Get extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session_02_Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Session_02_Get");
		
		HttpSession session = request.getSession();
		
		// request取值
		System.out.println("request取值：" + request.getAttribute("reqName"));
		
		// session取值
		System.out.println("session的值：" + session.getAttribute("sessionName"));
		
		//下面API特点：服务器会把SessionId放在下面这个url的后面
	    response.encodeRedirectURL("jsp/jsp_03_session.jsp");//encode编码
	}

}
