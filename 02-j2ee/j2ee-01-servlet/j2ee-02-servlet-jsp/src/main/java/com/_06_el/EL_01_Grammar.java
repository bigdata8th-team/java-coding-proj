package com._06_el;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com._05_listener.Listener_02_Servlet.Student;

/**
 * Servlet implementation class EL_01_Grammar
 */
@WebServlet("/EL_01_Grammar")
public class EL_01_Grammar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EL_01_Grammar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 代替request.getAttribute("...")
		 * 传值：Request.setAttribute(“aa”,”v1”);
		 * 接值：${aa}
		 * 传值：Request.setAttribute(“user”,user);
		 * 接值：${user.name}
		 */
		request.setCharacterEncoding("utf-8");
		request.setAttribute("name", "hank");
		Student stu = new Student("hank", 28);
		request.setAttribute("student", stu);
		
		System.out.println(request.getAttribute("name"));
		System.out.println(request.getAttribute("pwd"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("pwd"));
		request.getRequestDispatcher("jsp/jsp_06_el.jsp").forward(request, response);

	}

}
