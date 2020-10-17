<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar: empleado</title>
</head>
<body>
	<form>
		<input type="text" value="${empleado.nombre}"/>
		<input type="text" value="${empleado.dni}"/>
		<input type="text" value="${empleado.sexo}"/>
		<input type="text" value="${empleado.categoria}"/>
		<input type="text" value="${empleado.anos}"/>
		<button><a href="${pageContext.request.contextPath}/servlet?action=modificar">ENVIAR</a></button>
	</form>
	<a href="${pageContext.request.contextPath}/servlet?action=modificar">VOLVER</a>
</body>
</html>