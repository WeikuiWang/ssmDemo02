<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>id</td>
		<td>姓名</td>
		<td>密码</td>
	</tr>
	<c:forEach items="${userList }" var="bean" >
		<tr>
			<td>${bean.id }</td>
			<td>${bean.name }</td>
			<td>${bean.password }</td>		
		</tr>
	</c:forEach>
</table>
</body>
</html>