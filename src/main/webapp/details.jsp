<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<%@include file="assets/html/head.jsp"%>
<body>
<div class="title public-sans-bold bg-dark text-center text-light"><br><h2>Proveedor</h2><br></div>
	<div class="container p-2 my-3">
		<form class="form" method="post" action="${pageContext.request.contextPath}/ProveedorDetails">
			<input type="hidden" id="id" name="id" value="${proveedores.getId()}">
			<div class="row">
				<div class="col">
					<label for="nombre" class="form.label fw-bold">Nombre:</label><input
						type="text" class="form-control" id="nombre" name="nombre" placeholder="NOMBRE EMPRESA" autocomplete="off"
						value="${proveedores.getNombre()}">
				</div>
			</div>
			<div class="row">
				<div class="col py-3">
					<label for="rut" class="form-label fw-bold">Rut:</label><input type="text"
						class="form-control" id="rut" name="rut" placeholder="Ej: 12.345.678-9" autocomplete="off"
						value="${proveedores.getRut()}">
				</div>
			</div>
			<div class="row">
				<div class="col py-3">
					<label for="direccion" class="form.label fw-bold">Dirección:</label><input
						type="text" class="form-control" id="direccion" name="direccion"
						placeholder="Ej: Estado 123, Santiago" autocomplete="off"
						value="${proveedores.getDireccion()}">
				</div>
			</div>
			<div class="row">
				<div class="col py-3">
					<label for="correo" class="form.label fw-bold">Correo:</label><input
						type="text" class="form-control" id="correo" name="correo"
						placeholder="Example@example.com" autocomplete="off"
						value="${proveedores.getCorreo()}">
				</div>
			</div>
			<div class="row">
				<div class="col py-3">
					<label for="telefono" class="form.label fw-bold">Teléfono:</label><input
						type="text" class="form-control" id="telefono" name="telefono"
						placeholder="Ej: 22 123 4567" autocomplete="off"
						value="${proveedores.getTelefono()}">
				</div>
			</div>
			<div class="row">
				<div class="col py-3">
					<label for="contacto" class="form.label fw-bold">Contacto:</label><input
						type="text" class="form-control" id="contacto" name="contacto"
						placeholder="Ej: Daniel Moreira" autocomplete="off"
						value="${proveedores.getContacto()}">
				</div>
			</div>
			<div class="row">
				<div class="col py-3">
					<label for="telefonoContacto" class="form.label fw-bold">N° Contacto:</label><input
						type="text" class="form-control" id="telefonoContacto"
						placeholder="Ej: 569 1234 5678" autocomplete="off"
						name="telefonoContacto"
						value="${proveedores.getTelefonoContacto()}">
				</div>
			</div>
			<div class="row">
				<div class="col text-center py-4">
					<button type="submit" class="btn btn-info "><i class="fa-solid fa-floppy-disk"> Guardar</i></button>
				</div>
			</div>
		</form>
	</div>
<%@include file="assets/html/footer.jsp"%>
</body>
</html>