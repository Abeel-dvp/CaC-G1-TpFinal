<%@page import="ar.com.integrador.domain.Orador"%>
<%@page import="java.util.List"%>


<!doctype html>
<html lang="es">

	<head>
	  <meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	
	  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	  <link rel="stylesheet" href="css/estilos-propios.css">
	  <link rel="shortcut icon" href="./img/codoacodo-min.png" type="image/x-icon"><script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>


		<title>Trabajo Integrador</title>
	</head>
	<body>
	
		<!-- aca va el header.jsp -->
		 <jsp:include page="header.jsp"/>
		
		<main>
		
		    <div id="myCarousel" class="carousel slide mb-4" data-bs-ride="carousel">
		        <div class="carousel-indicators">
		            <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="active" aria-current="true"
		                aria-label="Slide 1"></button>
		            <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2"></button>
		            <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3"></button>
		        </div>
		        <div class="carousel-inner">
		            <div class="carousel-item active bg-carousel-ba1">
		                <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#000"/></svg>
		                <div class="container">
		                    <div class="carousel-caption text-end pb-5">
		                        <div class="row">
		                            <div class="col-lg-8 offset-lg-6">
		                                <h3>Conf Bs. As.</h3>
		                                <p>Bs. As. llega por primera vez a la Argentina. Un evento para compartir con nuestra comunidad el conocimiento y la experiencia de los expertos que estan creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. Te esperamos!</p>
		                                <p><a class="btn btn-outline-light mb-3" href="#form-orador">Quiero ser orador</a> <a class="btn btn-success ms-2 mb-3" href="comprar-tickets.html">Comprar tickets</a></p>
		                            </div>
		                        </div>
		                    </div>
		                </div>
		            </div>
		            <div class="carousel-item bg-carousel-ba2">
		                <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#000"/></svg>
		                <div class="container">
		                    <div class="carousel-caption text-end pb-5">
		                        <div class="row">
		                            <div class="col-lg-6 offset-lg-6">
		                                <h3>Conf Bs. As.</h3>
		                                <p>Bs. As. llega por primera vez a la Argentina. Un evento para compartir con nuestra comunidad el conocimiento y la experiencia de los expertos que estan creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. Te esperamos!</p>
		                                <p><a class="btn btn-outline-light mb-3" href="#form-orador">Quiero ser orador</a> <a class="btn btn-success ms-2 mb-3" href="comprar-tickets.html">Comprar tickets</a></p>
		                            </div>
		                        </div>
		                    </div>
		                </div>
		            </div>
		            <div class="carousel-item bg-carousel-ba3">
		                <svg class="bd-placeholder-img" width="100%" height="100%" xmlns="http://www.w3.org/2000/svg" aria-hidden="true" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#000"/></svg>
		                <div class="container">
		                    <div class="carousel-caption text-end pb-5">
		                        <div class="row">
		                            <div class="col-lg-6 offset-lg-6">
		                                <h3>Conf Bs. As.</h3>
		                                <p>Bs. As. llega por primera vez a la Argentina. Un evento para compartir con nuestra comunidad el conocimiento y la experiencia de los expertos que est�n creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. Te esperamos!</p>
		                                <p><a class="btn btn-outline-light mb-3" href="#form-orador">Quiero ser orador</a> <a class="btn btn-success ms-2 mb-3" href="comprar-tickets.html">Comprar tickets</a></p>
		                            </div>
		                        </div>
		                    </div>
		                </div>
		            </div>
		        </div>
		        <button class="carousel-control-prev" type="button" data-bs-target="#myCarousel" data-bs-slide="prev">
		            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		            <span class="visually-hidden">Anterior</span>
		        </button>
		        <button class="carousel-control-next" type="button" data-bs-target="#myCarousel" data-bs-slide="next">
		            <span class="carousel-control-next-icon" aria-hidden="true"></span>
		            <span class="visually-hidden">Siguiente</span>
		        </button>
		    </div>
		
		    <section class="container mb-4" id="oradores">
		        <h2 class="titulo-gral">Conoce a los <span>oradores</span></h2>





		        <div class="row justify-content-center">
		            <div class="col-md-11">
		                <div class="row row-cols-1 row-cols-md-3 g-4">
		                    <div class="col">
		                        <div class="card h-100">
		                            <img src="img/steve-min.jpg" class="card-img-top" alt="...">
		                            <div class="card-body">
		                                <div class="mb-2">
		                                    <span class="badge bg-warning text-dark">Javascript</span>
		                                    <span class="badge bg-info">React</span>
		                                </div>
		                                <h5 class="card-title">Steve Jobs</h5>
		                                <p class="card-text">
											Cofundador de Apple, lider visionario en tecnologia. Transformo la industria con productos emblematicos y un enfoque innovador. Su legado perdura, inspirando creatividad y cambio global en la era digital.</p>
		                            </div>
		                        </div>
		                    </div>
		                    <div class="col">
		                        <div class="card h-100">
		                            <img src="img/bill-min.jpg" class="card-img-top" alt="...">
		                            <div class="card-body">
		                                <div class="mb-2">
		                                    <span class="badge bg-warning text-dark">Javascript</span>
		                                    <span class="badge bg-info">React</span>
		                                </div>
		                                <h5 class="card-title">Bill Gates</h5>
		                                <p class="card-text">
											Co-fundador de Microsoft, lider en tecnologia e innovacion. Su vision revoluciono la informatica, creando Windows y dejando un impacto global a traves de su fundacion filantropica. Gates, una figura influyente en la historia contemporanea. </p>
		                            </div>
		                        </div>
		                    </div>
		                    <div class="col">
		                        <div class="card h-100">
		                            <img src="img/ada-min.jpeg" class="card-img-top" alt="...">
		                            <div class="card-body">
		                                <div class="mb-2">
		                                    <span class="badge bg-secondary">Negocios</span>
		                                    <span class="badge bg-danger">Startups</span>
		                                </div>
		                                <h5 class="card-title">Ada Lovelace</h5>
		                                <p class="card-text">Matematica del siglo XIX, pionera en programacion junto a Babbage, conceptualizo el "programa" para la Maquina Analitica. Su legado inspira mujeres en ciencia y tecnologia, trascendiendo barreras temporales.</p>
		                            </div>
		                        </div>
		                    </div>
		                </div>
		            </div>
		        </div>
		
		    </section>
		    <section class="container mb-4 text-center" id="restoOradores">
		       <a class="btn btn-outline-success" href="<%=request.getContextPath()%>/FindAllOradorController">Conoce al resto de los ORADORES</a>

				<h4>Carrusel de oradores</h4>



				<!-- Ahora, incluir el contenido de index.jsp -->
				<%@include file="/listado.jsp" %>

				<%
//					List<Orador> listado = (List<Orador>) request.getAttribute("listado");
//					System.out.println("LISTADO " + listado);

					if (listado != null) {
						System.out.println("Tamaño de la lista de oradores: " + listado.size());
				%>


				<!-- Resto del código del carrusel para oradores... -->
				<div id="oradoresCarousel" class="carousel slide mb-4" data-bs-ride="carousel">
					<!-- Resto del código del carrusel... -->
					<div class="carousel-inner">
						<!-- ESTO SE REPITE TANTA CANDTIDAD DE VECES COMO ARTICULOS TENGA -->



						<% for (Orador aOrador : listado) { %>
						<div class="carousel-item">
							<div class="card">
								<img src="<%= aOrador.getFotoUrl() %>" class="card-img-top" alt="Foto del Orador">
								<div class="card-body">
									<h5 class="card-title"><%= aOrador.getNombre() + " " + aOrador.getApellido() %></h5>
									<p class="card-text"><%= aOrador.getTema() %></p>
								</div>
							</div>
						</div>
						<% } %>
					</div>
					<button class="carousel-control-prev" type="button" data-bs-target="#oradoresCarousel" data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Anterior</span>
					</button>
					<button class="carousel-control-next" type="button" data-bs-target="#oradoresCarousel" data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Siguiente</span>
					</button>
				</div>



				</div>
				</div>
				<%
					} else {
						System.out.println("La lista de oradores es nula.");
					}
				%>
				</div>

			</section>
		
		    <section class="mb-4" id="lugar">
		        <div class="row g-0">
		            <div class="col-md">
		                <img src="img/honolulu-min.jpg" alt="Honolulu" class="img-fluid">
		            </div>
		            <div class="col-md text-light bg-aside1">
		                <h2>Bs As - Octubre</h2>
		                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. At placeat molestias vitae unde facere voluptatem minus voluptates commodi corrupti tenetur! Pariatur qui enim animi sapiente sed error similique molestiae ipsum! Lorem, ipsum dolor sit amet consectetur adipisicing elit. Perspiciatis, excepturi deleniti harum facilis id, a illo assumenda officiis illum praesentium eos. Qui laborum ratione in hic ducimus debitis voluptatum aperiam.</p>
		                <a class="btn btn-outline-light" href="#">Conocenos</a>
		            </div>
		        </div>
		    </section>
		
		    <section class="container" id="form-orador">
		        <div class="row justify-content-center">
		            <div class="col-lg-8 col-xl-7">
		                <h2 class="titulo-gral">Conviertete en un <span>orador</span></h2>
		                <p class="text-center">Anotate como orador para dar una charla ignite. Cuentanos de que quieres hablar!</p>
		                <form action="<%=request.getContextPath()%>/CreateOradorController" method="POST">
		                    <div class="row gx-2">
		                        <div class="col-md mb-3">
		                            <input type="text" class="form-control" name="nombre" placeholder="Nombre" aria-label="Nombre" required>
		                        </div>
		                        <div class="col-md mb-3">
		                            <input type="text" class="form-control" name="apellido" placeholder="Apellido" aria-label="Apellido" required>
		                        </div>
		                    </div>
		                    <div class="row">
		                        <div class="col mb-3">
		                            <input type="email" class="form-control" name="mail" placeholder="Email" aria-label="Email" required>
		                        </div>
		                    </div>

							<div class="col-md mb-3">
								<!-- Campo de URL modificable -->
								<input type="text" class="form-control"
									   name="foto_url"
									   placeholder="URL de la foto"
									   aria-label="URL de la foto"
									   required>
							</div>

<%--							<div class="row">--%>
<%--								<div class="col mb-3">--%>
<%--									<label for="fileInput" class="form-label">Selecciona una imagen:</label>--%>
<%--									<input type="file" class="form-control" id="fileInput" name="imagen" accept="image/*" required>--%>
<%--&lt;%&ndash;									<input type="file" class="form-control" id="fileInput" name="imagen" accept="image/*" required onchange="obtenerUrlCloudinary()">&ndash;%&gt;--%>
<%--									<div id="imageInput" class="form-text mb-3">Selecciona una imagen para tu presentacion.</div>--%>
<%--									<input type="hidden" id="urlCloudinary" name="urlCloudinary">--%>
<%--								</div>--%>
<%--							</div>--%>



							<div class="row">
		                        <div class="col mb-3">
		                            <textarea class="form-control" name="tema" id="exampleFormControlTextarea1" rows="4"
		                                placeholder="Sobre que quieres hablar?" required></textarea>
		                            <div id="emailHelp" class="form-text mb-3">Recuerda incluir un titulo para tu charla.</div>
		                            <div class="d-grid">
		                                <button type="submit" class="btn btn-lg btn-form">Enviar</button>
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

		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<%--		<script>--%>

<%--			--%>

<%--			function obtenerUrlCloudinary() {--%>
<%--				const input = document.getElementById('fileInput');--%>
<%--				const urlInput = document.getElementById('urlCloudinary');--%>

<%--				// Agregar log--%>
<%--				console.log('Iniciando el proceso de carga a Cloudinary...');--%>

<%--				const file = input.files[0];--%>
<%--				const formData = new FormData();--%>
<%--				formData.append('file', file);--%>
<%--				//formData.append('upload_preset', 'ml_default');  // Reemplaza 'CLOUDINARY_PRESET' con tu valor real--%>

<%--				const url = `https://api.cloudinary.com/v1_1/${cloudName}/image/upload`;--%>

<%--				console.log('URL de Cloudinary:', url);--%>

<%--				fetch(url, {--%>
<%--					method: 'POST',--%>
<%--					body: formData,--%>
<%--					headers: {--%>
<%--						'Authorization': 'Bearer 491418468219219',--%>
<%--					},--%>
<%--				})--%>
<%--						.then(response => {--%>
<%--							console.log('Respuesta de Cloudinary:', response);--%>

<%--							if (!response.ok) {--%>
<%--								console.error('Error al cargar la imagen a Cloudinary:', response);--%>
<%--								throw new Error('Error al cargar la imagen a Cloudinary');--%>
<%--							}--%>

<%--							return response.json();--%>
<%--						})--%>
<%--						.then(data => {--%>
<%--							const imageUrl = data.secure_url;--%>

<%--							// Agregar logs--%>
<%--							console.log('URL de Cloudinary obtenida con éxito:', imageUrl);--%>
<%--							console.log('Asignando la URL al campo oculto...');--%>

<%--							urlInput.value = imageUrl; // Asignar la URL al campo oculto--%>

<%--							// Agregar log--%>
<%--							console.log('Proceso de carga a Cloudinary completado con éxito.');--%>
<%--						})--%>
<%--						.catch(error => {--%>
<%--							// Agregar log de error--%>
<%--							console.error('Error al obtener la URL de Cloudinary:', error);--%>
<%--						});--%>
<%--			}--%>

<%--		</script>--%>

	</body>
</html>