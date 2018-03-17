<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String webpath = request.getContextPath();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>springdemo</title>
</head>
<body>
	<div>
		<form action="<%=webpath%>/user/showUser" method="post">
			<span>id:1</span><input type="hidden" name="id" value="1" />
			<input type="submit" name="submit" value="获取用户 " />
		</form>
		<form action="<%=webpath%>/user/showUser" method="post">
			<span>id:2</span><input type="hidden" name="id" value="2" />
			<input type="submit" name="submit" value="获取用户 " />
		</form>
		<form action="<%=webpath%>/user/showUser" method="post">
			<span>id:3</span><input type="hidden" name="id" value="3" />
			<input type="submit" name="submit" value="获取用户 " />
		</form>
		<form action="<%=webpath%>/user/showUser" method="post">
			<span>id:4</span><input type="hidden" name="id" value="4" />
			<input type="submit" name="submit" value="获取用户 " />
		</form>
	</div>
</body>
</html>