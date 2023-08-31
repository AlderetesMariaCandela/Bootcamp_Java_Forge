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
<title>Nuevo Contacto</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>

	<div class="conteiner">
	<h2>Nuevo Contacto</h2>
	<form:form action="/contacts/create" method="POST" modelAttribute="contact">
		<div class="form-group" >
			<form:label class="form-label" path="student">Student</form:label>
				<form:errors class="text-danger" path="student"/>
				<form:select class="form-control" path="student">
					<c:forEach items="${student }" var="s">
						<form:option value="${s.id }"> ${s.firstName } ${s.lastName } </form:option>
					</c:forEach>
				</form:select>
		</div>
		<div class="form-group">
			<form:label class="form-label" path="address">Address</form:label>
        	<form:errors class="text-danger" path="address"/>
        	<form:input class="form-control w-50" path="address" />
		</div>
		<div class="form-group">
			<form:label class="form-label" path="city">City</form:label>
        	<form:errors class="text-danger" path="city"/>
        	<form:input class="form-control w-50" path="city" />
		</div>
		<div class="form-group">
			<form:label class="form-label" path="state">State</form:label>
        	<form:errors class="text-danger" path="state"/>
        	<form:input class="form-control w-50" path="state" />
		</div>
		<button class="btn btn-success" >Crear Contacto</button>
	</form:form>
	</div>

</body>
</html>