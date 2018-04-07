<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="java.util.*,com.*"%><!-- 导包 -->
<!-- JSTL标签库 -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>JQuery test</title>
</head>
<!-- 导入jquery-1.5库 -->
<!-- 属于一个轻量级的js -->
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.5.js"></script>
<body>
	当前上下文路径：<%=request.getContextPath()%><br>
	用户名：
	<input type="text" name="name" id="text"> 
	密码：
	<input type="password" name="pwd">
	<input type="button" value="点我啊" onclick="testQuery()">
</body>
<script type="text/javascript">
function test() {
	var userName = document.getElementById("text").value;
	alert("用户名为：" + userName);
}

function testQuery() {
	var userName = $("#text").val();
	alert("用户名为：" + userName);
}
</script>
</html>