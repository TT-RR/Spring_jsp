<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>テストjsp</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<%
	int sum = 0;
	for (int i = 1; i <= 10; i = i + 1) {
	sum = sum + i;
	}
	System.out.println("合計：" + sum);
	%>
	
	<%= sum %>
</body>
</html>