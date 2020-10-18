<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" type="text/css"
	href="assets/Bootstrap/bootstrap-4.5.3-dist/css/bootstrap.min.css">
<!-- Bootstrap JS -->
<script src="assets/Bootstrap/bootstrap-4.5.3-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div>
			<h1 class="p-4 text-center">Gestión de nóminas</h1>
		</div>
		<div class="border border-dark">
			<div class="row">
				<h3 class="col-lg-12 pt-3 text-center">Menú principal</h3>
			</div>
			<div class="row">
				<ul class="list-group-flush w-100 col-md-12 col-lg-12">
					<a class="list-group-item"
						href="${pageContext.request.contextPath}/servlet?action=lista">Listar</a>
					<a class="list-group-item"
						href="${pageContext.request.contextPath}/servlet?action=devolver">Devolver</a>
					<a class="list-group-item"
						href="${pageContext.request.contextPath}/servlet?action=modificar">Modificar</a>
				</ul>
			</div>
		</div>
	</div>
</body>
</html>