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

<li><a href="/languages/${lenguajes.id}/edit">Edit</a></li>

	<form:form action="/languages/${id}" method="post" modelAttribute="lenguajes" class="w-75 mx-auto d-flex flex-column">
		<input type="hidden" name="_method" value="put">
		<div class="d-flex flex-row justify-content-between form-group m-4">
			<form:label path="nameL">Name</form:label>
			<form:errors class="text-danger" path="nameL" />
			<form:input path="nameL" class="form-control w-50" />
		</div>
		<div class="d-flex flex-row justify-content-between form-group m-4">
			<form:label path="creatorL">Creator</form:label>
			<form:errors class="text-danger" path="creatorL" />
			<form:textarea path="creatorL" class="form-control w-50" />
		</div>
		<div class="d-flex flex-row justify-content-between form-group m-4">
			<form:label path="versionL">Language</form:label>
			<form:errors class="text-danger" path="versionL" />
			<form:input path="versionL" class="form-control w-50" />
		</div>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>