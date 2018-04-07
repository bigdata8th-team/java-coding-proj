package com._10_json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Student;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

/**
 * Servlet implementation class JSON_01_Demo
 */
@WebServlet("/JSON_01_Demo")
public class JSON_01_Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSON_01_Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Student stu = new Student("hank", 28, "handsomboy");
		/*
		 * 需要将
		 * json-lib-2.2.3-jdk15.jar
		 * commons-beanutils-1.7.0.jar
		 * commons-collections-3.2.1.jar
		 * commons-lang-2.4.jar
		 * commons-logging-1.0.4.jar
		 * ezmorph-1.0.3.jar
		 * 放到WEB-INF/lib目录下
		 */
		// 解析json对象
		JSONObject obj = JSONObject.fromObject(stu);
		System.out.println("JSON object string:" + obj.toString());
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("hank", 28, "good"));
		list.add(new Student("bob", 30, "soso"));
		list.add(new Student("james", 24, "bad"));
		// json数组
		JSONArray arr = JSONArray.fromObject(list);

		System.out.println("JSON array string:" + arr.toString());
		response.sendRedirect("index.html");
	}

}
