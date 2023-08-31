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
<title>Inicio de Sesi�n</title>
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- Cambiar para que coincida con Tu archivo/estructura de nombres -->
<link rel="stylesheet" href="/css/main.css">
<script type="text/javascript" src="/js/app.js"></script>

</head>
<body>
<div class="container">

		<div class="row">

			<div class="col-4 offset-1">
				<h2>Register!</h2>
				<div>
					<form:errors class="text-danger" path="user.*" />
				</div>

				<form:form method="POST" action="/registration"
					modelAttribute="user">
					<div>
						<form:label path="email">Email:</form:label>
						<form:input type="email" path="email" />
					</div>
					<div>
						<form:label path="password">Password:</form:label>
						<form:password path="password" />
					</div>
					<div>
						<form:label path="passwordConfirmation">Password Confirmation:</form:label>
						<form:password path="passwordConfirmation" />
					</div>
					<input type="submit" value="Register!" />
				</form:form>
				<p class="text-success"> <c:out value="${registro }"></c:out> </p>
			</div>

			<div class="col-4 offset-1">
				<h2>Login</h2>

				<div>
					<form:errors class="text-danger" path="login.*" />
				</div>

				<form:form method="POST" action="/login" modelAttribute="login">
					<div>
						<form:label path="email">Email:</form:label>
						<form:input type="email" path="email" />
					</div>
					<div>
						<form:label path="password">Password:</form:label>
						<form:password path="password" />
					</div>

					<input type="submit" value="Login!" />
				</form:form>
			</div>
		</div>


	</div>
</body>
</html>