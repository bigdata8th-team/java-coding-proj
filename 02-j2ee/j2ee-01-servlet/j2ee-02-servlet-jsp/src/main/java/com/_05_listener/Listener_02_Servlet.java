package com._05_listener;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Listener_02_Servlet
 */
@WebServlet("/Listener_02_Servlet")
public class Listener_02_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static class Student {
		private int age;
		private String name;
		
		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		void display() {
			System.out.println(name);
			System.out.println(age);
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listener_02_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		request.setAttribute("name", "hank");
		
		Student stu = new Student("hank", 28);
		request.setAttribute("student", stu);
		
		System.out.println(request.getAttribute("name"));
		System.out.println(request.getAttribute("pwd"));
		System.out.println(request.getParameter("name"));
		System.out.println(request.getParameter("pwd"));
		request.getRequestDispatcher("jsp/jsp_05_listener.jsp").forward(request, response);

	}

}
