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
<title>Nueva Persona</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<div class="conteiner">
		<h2>Nueva Persona</h2>
		<form:form action="/person/new" method="POST" modelAttribute="persona">
			<div class="form-group">
				<form:label class="form-label" path="firstName">First Name</form:label>
        		<form:errors class="text-danger" path="firstName"/>
        		<form:input class="form-control w-50" path="firstName" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="lastName">Last Name</form:label>
        		<form:errors class="text-danger" path="lastName"/>
        		<form:input class="form-control w-50" path="lastName" />
			</div>
			<button class="btn btn-success" >Crear Persona</button>
		</form:form>
	</div>
	
</body>
</html>