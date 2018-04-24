<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

</head>
<body>
<h1>测试表单</h1>
<form action="emp/findEmp.do" method="post">
        账号：<input type="text" name="name"/><br/><br/>
        密码：<input type="password" name="password"/><br/><br/>
       <input type="submit" value="提交"/>
</form>
</body>
</html>