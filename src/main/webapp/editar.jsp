<main class="mb-5">
	<section class="container mt-5" id="form-orador">
		<div class="row justify-content-center">
			<div class="col-lg-8 col-xl-7">
				<h2 class="titulo-gral">Modificar datos del Orador</h2>

				<form action="<%=request.getContextPath()%>/UpdateOradorController" method="POST">
					<div class="row gx-2">
						<div class="col-md mb-3">
							<!-- Campo de ID inmodificable -->
							<input type="text" class="form-control"
								   placeholder="ID del Orador"
								   aria-label="ID del Orador"
								   name="id"
								   value="<%=orador.getId()%>"
								   readonly>
						</div>
						<div class="col-md mb-3">
							<input type="text" class="form-control" name="nombre" placeholder="Nombre" aria-label="Nombre"
								   value="<%=orador.getNombre()%>"
								   required>
						</div>
						<div class="col-md mb-3">
							<input type="text" class="form-control" name="apellido" placeholder="Apellido" aria-label="Apellido"
								   value="<%=orador.getApellido()%>"
								   required>
						</div>
					</div>
					<div class="row">
						<div class="col mb-3">
							<input type="email" class="form-control" name="mail" placeholder="Email" aria-label="Email"
								   value="<%=orador.getMail()%>"
								   required>
						</div>
					</div>
					<div class="row">
						<div class="col mb-3">
                            <textarea class="form-control" name="tema" id="exampleFormControlTextarea1" rows="4"
									  placeholder="<%=orador.getTema()%>"
									  required><%=orador.getTema()%> </textarea>
							<div id="emailHelp" class="form-text mb-3">Recuerda incluir un título para tu charla.</div>
							<div class="d-grid">
								<button type="submit" class="btn btn-lg btn-form">Modificar</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
</main>

<footer id="main-footer">
	<div class="container">
		<ul class="nav justify-content-center justify-content-lg-between align-items-center">
			<li class="nav-item">
				<a class="nav-link" href="#">Preguntas <span>frecuentes</span></a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">Contactanos</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">Prensa</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">Conferencias</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">Terminos y <span>condiciones</span></a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">Privacidad</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="#">Estudiantes</a>
			</li>
		</ul>
	</div>
</footer>
