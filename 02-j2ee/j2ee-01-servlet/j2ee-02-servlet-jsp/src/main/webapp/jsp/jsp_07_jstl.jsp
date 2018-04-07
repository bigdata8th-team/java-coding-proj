<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="java.util.*,com.*"%><!-- 导包 -->
<!-- JSTL标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <% List<Student> list = (List<Student>)request.getAttribute("stuList"); %>
	<!-- 传统方式 -->
	传统方式产生的表：<br>
	<table border = "1">
		<tr>
			<td>名字</td>
			<td>年龄</td>
			<td>品格</td>
		</tr>
		<!-- 调用for循环，产生table -->
		<%for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
		%>
			<tr> 
				<td><%=stu.getName() %></td>
				<td><%=stu.getAge() %></td>
				<td><%=stu.getOther() %></td>
			</tr>
		<%} %>
	</table>
	<!-- JSTL方式接List -->
	<br>JSTL方式产生的表<br>
	<table border="2">
		<tr>
			<td>名字</td>
			<td>年龄</td>
			<td>品格</td>
			<td>年龄范围</td>
		</tr>
		<c:forEach items="${stuList}" var="a">
			<tr>
				<td>${a.name }</td>
				<td>${a.age }</td>
				<td>${a.other }</td>
				<td>
					<c:choose>
						<c:when test="${a.age < 28 }">小青年</c:when>
						<c:when test="${a.age == 28 }">青年</c:when>
						<c:otherwise>大龄青年</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<br>
	选择的性别是：<c:if test="${sex == 'm' }">男</c:if>
</body>
</html>