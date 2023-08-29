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
<title>USUARIOS</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<h1>Bienvenidos a la BD de Licencias de Conducir</h1>
	
	<a href="/person/new">Agrega una Nueva Persona</a>
	
	<a href="/licencias/new">Agrega una Nueva Licencia</a>
	
	<table class="table table-hover">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Numero Licencia</th>
				<th>Fecha de Vencimiento</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos }" var="persona">
				<tr>
					<td>${persona.firstName } ${persona.lastName } </td>
<!--                <td>${persona.getLicense().getNumber() } </td>  -->		
					<td>${persona.getLicense().getNumberComoString() } </td>
					<td>${persona.getLicense().getFechaVencimientoFormateada() } </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>