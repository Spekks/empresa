<%@ taglib prefix="cursor" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listar</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/Bootstrap/bootstrap-4.5.3-dist/css/bootstrap.min.css">
<!-- Bootstrap JS -->
<script src="assets/Bootstrap/bootstrap-4.5.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div>
			<h1 class="p-4 text-center">Listado de empleados</h1>
		</div>
		<div class="table-responsive">
			<table class="table text-center">
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
		</div>
		<div class="p-4">
			<a class="btn btn-primary btn-sm" href="empresa.jsp">VOLVER</a>
		</div>
	</div>
</body>
</html>