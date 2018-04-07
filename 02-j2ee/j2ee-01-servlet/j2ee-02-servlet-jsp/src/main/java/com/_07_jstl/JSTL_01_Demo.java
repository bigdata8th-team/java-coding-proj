package com._07_jstl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Student;

/**
 * Servlet implementation class JSTL_01_Demo
 */
@WebServlet("/JSTL_01_Demo")
public class JSTL_01_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSTL_01_Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		/*
		 * %@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %
		 * jstl.jar、 standard.jar两个jar包放到WebContent/web-inf/lib下
		 */
		String sex = request.getParameter("sex");
		request.setAttribute("sex", sex);
	
		List<Student> list = new ArrayList<>();
		list.add(new Student("hank", 28, "good"));
		list.add(new Student("bob", 30, "soso"));
		list.add(new Student("james", 24, "bad"));
		
		request.setAttribute("stuList", list);
		request.getRequestDispatcher("jsp/jsp_07_jstl.jsp").forward(request, response);
	}

}
