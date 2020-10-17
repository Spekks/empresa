<%@ taglib prefix="cursor" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Listar</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>NOMBRE:</th>
				<th>DNI:</th>
				<th>SEXO:</th>
				<th>CATEGORÍA:</th>
				<th>AÑOS TRABAJADOS:</th>
			</tr>
		</thead>
		<tbody>
		<cursor:forEach var="empleado" items="${empleados}">
			<tr>
				<td>${empleado.nombre}</td>
				<td>${empleado.dni}</td>
				<td>${empleado.sexo}</td>
				<td>${empleado.categoria}</td>
				<td>${empleado.anos}</td>
			</tr>
		</cursor:forEach>
		</tbody>
	</table>
	<a href="empresa.jsp">VOLVER</a>
</body>
</html>