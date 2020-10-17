<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hola</h1>
	<form action="${pageContext.request.contextPath}/servlet?action=salario" method="POST">
		<label for="dni">DNI:</label>
		<input type="text" name="dni"/>
		<button type="submit">ENVIAR</button>
	</form>
	<div>
		<p>DNI: ${dni}. Salario: ${salario}</p>
	</div>
	<a href="empresa.jsp">VOLVER</a>
</body>
</html>