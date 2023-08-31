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
<title>Nuevo Producto</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
<div class="conteiner">
		<h2>Nuevo Producto</h2>
		<form:form action="/products/new" method="POST" modelAttribute="producto">
			<div class="form-group">
				<form:label class="form-label" path="name">Name</form:label>
        		<form:errors class="text-danger" path="name"/>
        		<form:input class="form-control w-50" path="name" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="description">Description</form:label>
        		<form:errors class="text-danger" path="description"/>
        		<form:input class="form-control w-50" path="description" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="price">Price</form:label>
        		<form:errors class="text-danger" path="price"/>
        		<form:input class="form-control w-50" path="price" />
			</div>
			<button class="btn btn-success mt-2" >Crear Producto</button>
		</form:form>
	</div>
</body>
</html>