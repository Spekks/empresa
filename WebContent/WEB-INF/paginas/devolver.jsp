<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Devolver</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/Bootstrap/bootstrap-4.5.3-dist/css/bootstrap.min.css">
<!-- Bootstrap JS -->
<script src="assets/Bootstrap/bootstrap-4.5.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div>
			<h1 class="p-4 text-center">Devolución de un empleado</h1>
		</div>
		<div class="row">
			<div class="col-md-6 col-sm-12">
				<form
					id="form" action="${pageContext.request.contextPath}/servlet?action=salario"
					method="POST" onsubmit="enviar()">
					<div class="form-group">
						<label for="dni">DNI:</label> 
						<input class="form-control" type="text" name="dni" />
					</div>
					<div class="form-group">
						<button class="btn btn-secondary btn-sm" type="submit">ENVIAR</button>
					</div>
				</form>
			</div>
			<div class="col-md-6 col-sm-12">
				<p>DNI: ${dni}</p> 
				<p>Salario: ${salario}</p>
			</div>
		</div>
		<div class="p-4">
			<a class="btn btn-primary btn-sm" href="empresa.jsp">VOLVER</a>
		</div>
	</div>
</body>
</html>