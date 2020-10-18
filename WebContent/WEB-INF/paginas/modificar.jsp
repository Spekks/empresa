<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar: empleado</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/Bootstrap/bootstrap-4.5.3-dist/css/bootstrap.min.css">
<!-- Bootstrap JS -->
<script src="assets/Bootstrap/bootstrap-4.5.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div>
			<h1 class="p-4 text-center">Modificar un empleado</h1>
		</div>
		<div class="w-50">
			<form>
				<div class="form-group">
					<label for="name">Nombre:</label>
					<input class="col-lg-7 form-control" type="text" value="${empleado.nombre}" name="name" />
				</div>
				<div class="form-group">
					<label for="dni">DNI::</label>
					<input class="col-lg-7 form-control" type="text" value="${empleado.dni}" name="dni" />
				</div>
				<div class="form-group">
					<label for="sex">Sexo:</label>
					<input class="col-lg-7 form-control" type="text" value="${empleado.sexo}" name="sex " />
				</div>
				<div class="form-group">
					<label for="category">Categoría profesional:</label>
					<input class="col-lg-7 form-control" type="text" value="${empleado.categoria}"
						name="category" />
				</div>
				<div class="form-group">
					<label for="anos">Años trabajados:</label>
					<input class="col-lg-7 form-control" type="text" value="${empleado.anos}"
						name="anos" />
				</div>
				<a class="btn btn-secondary btn-sm"
					href="${pageContext.request.contextPath}/servlet?action=modificar">ENVIAR</a>
			</form>
		</div>
		<div class="p-4">
			<a class="btn btn-primary btn-sm" href="${pageContext.request.contextPath}/servlet?action=modificar">VOLVER</a>
		</div>
	</div>
</body>
</html>