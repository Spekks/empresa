<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Index</title>
</head>
<body>
	<ul>
		<li><a href="${pageContext.request.contextPath}/servlet?action=lista">Listar</a></li>
		<li><a href="${pageContext.request.contextPath}/servlet?action=devolver">Devolver</a></li>
		<li><a href="${pageContext.request.contextPath}/servlet?action=modificar">Modificar</a></li>
	</ul>
</body>
</html>