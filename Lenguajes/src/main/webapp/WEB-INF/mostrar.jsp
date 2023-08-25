<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>AQUI EL TITULO DE TU PLANTILLA</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<a href="/languages">DASHBOARD</a>
	<ul>
		<li><c:out value="${lenguajes.nameL}" /></li>
		<li><c:out value="${lenguajes.creatorL}" /></li>
		<li><c:out value="${lenguajes.versionL}" /></li>
		<li><a href="/languages/${lenguajes.id}/edit">Edit</a></li>
		<li>
			<form action="/languages/${lenguajes.id}" method="post">
				<input type="hidden" name="_method" value="delete" /> 
				<input class="btn btn-link" type="submit" value="delete" />
			</form>
		</li>
	</ul>

</body>

</html>