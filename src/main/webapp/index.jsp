<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="assets/html/head.jsp"%>

<body>
<section>
<div class="text text-center bg-dark text-light public-sans-bold"><br><h2>Listado de Proveedores</h2><br></div>
<div class="d-grid gap-2 col-6 mx-auto">
<br>
  <a href="${pageContext.request.contextPath}/ProveedorDetails" class="btn btn-info fw-bold" href="*" type="button"><i class="fa-solid fa-user-plus"></i> Agregar Proveedor</a>
</div>
	<div class="container">
		<table class="table table-striped text-dark" id="tbProveedores">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Rut</th>
					<th>Dirección</th>
					<th>Correo</th>
					<th>Teléfono</th>
					<th>Contacto</th>
					<th>Teléfono Contacto</th>
					<th class="w-50">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${proveedores}">
					<tr>
						<th><c:out value="${p.getId()}"></c:out></th>
						<td><c:out value="${p.getNombre()}"></c:out></td>
						<td><c:out value="${p.getRut()}"></c:out></td>
						<td><c:out value="${p.getDireccion()}"></c:out></td>
						<td><c:out value="${p.getCorreo()}"></c:out></td>
						<td><c:out value="${p.getTelefono()}"></c:out></td>
						<td><c:out value="${p.getContacto()}"></c:out></td>
						<td><c:out value="${p.getTelefonoContacto()}"></c:out></td>
						<td class="w-50 text-center">
						<a href="${pageContext.request.contextPath}/ProveedorDetails?id=${p.getId()}" class="btn btn-info text-light" role=”img” title=editar>
						<span class="fa-solid fa-user-pen"></span></a>
						<a href="${pageContext.request.contextPath}/ProveedorDetails?id=${p.getId()}&op=del" class="btn btn-danger" role=”img” title=borrar> 
						<span class="fa-solid fa-user-xmark"></span></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</section>
<%@include file="assets/html/footer.jsp"%>
</body>
</html>