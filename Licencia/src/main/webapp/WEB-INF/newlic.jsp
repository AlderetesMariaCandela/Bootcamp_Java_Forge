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
<title>Nueva Licencia</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
	<div class="conteiner mx-auto">
		<h2>Nueva Licencia</h2>
		<form:form action="/licencias/new" method="POST" modelAttribute="licencia">
			<div class="form-group">
			<form:label class="form-label" path="persona">Persona</form:label>
				<form:errors class="text-danger" path="persona"/>
				<form:select class="form-control" path="persona">
					<c:forEach items="${personas }" var="p">
						<form:option value="${p.id }"> ${p.firstName } ${p.lastName } </form:option>
					</c:forEach>
				</form:select>
			</div>
			<div class="form-group">
				<form:label class="form-label" path="state">Estado</form:label>
        		<form:errors class="text-danger" path="state"/>
        		<form:input class="form-control w-50" path="state" />
			</div>
			<div class="form-group">
				<form:label class="form-label" path="expirationDate">Fecha de Vencimiento</form:label>
        		<form:errors class="text-danger" path="expirationDate"/>
        		<form:input type="date" class="form-control w-50" path="expirationDate" />
			</div>
			
			<button class="btn btn-success" >Crear Licencia</button>
		</form:form>
	</div>
</body>
</html>