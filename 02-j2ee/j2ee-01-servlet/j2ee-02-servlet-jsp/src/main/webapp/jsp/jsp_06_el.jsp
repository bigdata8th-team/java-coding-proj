<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="java.util.*,com._05_listener.Listener_02_Servlet"%><!-- 导包 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	传统的值：<%=request.getAttribute("name") %>
	EL：${name}<br>
	
	传统放控件中：<input value="<%=request.getAttribute("name") %>" ><br>
	EL放在控件中：<input value="${name}"><br>
	
	<!-- 放在控件中接对象 -->
	<%Listener_02_Servlet.Student stu = (Listener_02_Servlet.Student)request.getAttribute("student"); %>
	传统接学生姓名：<input value="<%=stu.getName() %>"><br>
	<!-- student是servlet注册的key值 -->
	<!-- 相当于调用student.getAge方法 -->
	EL接学生年龄：${student.age}<br>
	<!-- 相当于调用student.getName方法 -->
	EL接学生姓名：${student.name}<br>
</body>
</html>