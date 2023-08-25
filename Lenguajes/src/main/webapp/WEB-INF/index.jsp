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
<title>Lenguages</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>


	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lenguajes}" var="len">
				<tr>
					<td><a href="/languages/${len.id}"><c:out value="${len.nameL}" /></a></td>
					<td><c:out value="${len.creatorL}" /></td>
					<td><c:out value="${len.versionL}" /></td>
					<td><a href="/languages/${len.id}/edit">Edit</a>

						<form action="/languages/${len.id}" method="post">
							<input type="hidden" name="_method" value="delete" /> <input
								class="btn btn-link" type="submit" value="delete" />
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<br>

	<h1>Nuevo Lenguaje</h1>
	<form:form action="/languages" method="post" modelAttribute="lenguaje"
		class="w-75 mx-auto d-flex flex-column">
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