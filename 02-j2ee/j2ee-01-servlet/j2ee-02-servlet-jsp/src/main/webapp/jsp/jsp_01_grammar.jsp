<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*,com.Student"%><!-- 导包 -->    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>01_jsp_语法测试</title>
</head>
<body>
	<p>Grammar_01_Jsp</p>
	3 + 9 = <%=3+9 %><!-- pw.write(3+9); -->
	<!-- pw.write() -->
	<!-- 带=的，不用写分号，可直接出现在html上，
	不带＝的，属于java的一句话，需要带分号 -->
	后台传过来的数据：
	<%=request.getAttribute("userNmae") %><br>
	<%String str = (String)request.getAttribute("userNmae"); %>
	
	<input type="text" value = "<%=str %>"/>
	<%List<Student> list = (List<Student>)request.getAttribute("student"); %>
	<table border="1">
		<tr>
			<td>姓名</td>
			<td>年龄</td>
			<td>其他</td>
		</tr>
		<%for(int i=0; i<list.size(); i++){
			Student s = list.get(i);
		%>
			<tr>
				<td><%=s.getName()%></td>
				<td><%=s.getAge()%></td>
				<td><%=s.getOther()%></td>
			</tr>
		<%}%>
	</table>
</body>
</html>