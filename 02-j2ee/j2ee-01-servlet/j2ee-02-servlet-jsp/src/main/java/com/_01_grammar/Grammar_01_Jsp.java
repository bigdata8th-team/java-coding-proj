package com._01_grammar;

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
 * Servlet implementation class Grammar_01_Jsp
 */
@WebServlet("/Grammar_01_Jsp")
public class Grammar_01_Jsp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Grammar_01_Jsp() {
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
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Grammar_01_Jsp");
		
		//往request里放值,传给前台jsp页面
		request.setAttribute("userNmae", "张三");
		
		//准备一个list,模拟后台数据库查到的值，传前台
		List<Student> list = new ArrayList<>();
		list.add(new Student("张三",23,"aaa"));
		list.add(new Student("李四",24,"bbb"));
		list.add(new Student("王五",25,"123"));
		list.add(new Student("赵六",26,"qwe"));
		
		//往前台传，其中"aaa"是key,,"list"是value
		request.setAttribute("student", list);
		
		// 将数据转发到jsp处理
		request.getRequestDispatcher("jsp/jsp_01_grammar.jsp").forward(request, response);
	}

}
