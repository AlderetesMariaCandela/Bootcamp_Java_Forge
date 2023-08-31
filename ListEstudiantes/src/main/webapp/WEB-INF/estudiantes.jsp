<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- Formateo de fechas (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- Formulario form: form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- Para errores de renderizado en rutas PUT -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Estudiantes</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
	
	<div class="conteiner">
	<h2>Todos los Estudiantes</h2>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Address</th>
				<th>City</th>
				<th>State</th>
			</tr>
		</thead>
		<tbody>
				<c:forEach items="${student}" var="estudiante">
					<tr>		            
						<td><c:out value="${estudiante.firstName} ${estudiante.firstName}"/></td>
						<td><c:out value="${estudiante.age}"/></td>
						<td><c:out value="${estudiante.getContactmodel().getAddress()}"/></td>
						<td><c:out value="${estudiante.getContactmodel().getCity()}"/></td>
						<td><c:out value="${estudiante.getContactmodel().getState()}"/></td>
					</tr>
				</c:forEach>
			</tbody>
	</table>
	</div>
</body>
</html>