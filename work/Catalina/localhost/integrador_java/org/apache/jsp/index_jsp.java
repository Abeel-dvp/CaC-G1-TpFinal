/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-05 15:33:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ar.com.integrador.domain.Orador;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("ar.com.integrador.domain.Orador");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("\r\n");
      out.write("	<head>\r\n");
      out.write("	  <meta charset=\"utf-8\">\r\n");
      out.write("	  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("	\r\n");
      out.write("	  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("	  <link rel=\"stylesheet\" href=\"css/estilos-propios.css\">\r\n");
      out.write("	  <link rel=\"shortcut icon\" href=\"./img/codoacodo-min.png\" type=\"image/x-icon\">\r\n");
      out.write("	\r\n");
      out.write("	  <title>Trabajo Integrador</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	\r\n");
      out.write("		<!-- aca va el header.jsp -->\r\n");
      out.write("		 ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<main>\r\n");
      out.write("		\r\n");
      out.write("		    <div id=\"myCarousel\" class=\"carousel slide mb-4\" data-bs-ride=\"carousel\">\r\n");
      out.write("		        <div class=\"carousel-indicators\">\r\n");
      out.write("		            <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\"\r\n");
      out.write("		                aria-label=\"Slide 1\"></button>\r\n");
      out.write("		            <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n");
      out.write("		            <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n");
      out.write("		        </div>\r\n");
      out.write("		        <div class=\"carousel-inner\">\r\n");
      out.write("		            <div class=\"carousel-item active bg-carousel-ba1\">\r\n");
      out.write("		                <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><rect width=\"100%\" height=\"100%\" fill=\"#000\"/></svg>\r\n");
      out.write("		                <div class=\"container\">\r\n");
      out.write("		                    <div class=\"carousel-caption text-end pb-5\">\r\n");
      out.write("		                        <div class=\"row\">\r\n");
      out.write("		                            <div class=\"col-lg-8 offset-lg-6\">\r\n");
      out.write("		                                <h3>Conf Bs. As.</h3>\r\n");
      out.write("		                                <p>Bs. As. llega por primera vez a la Argentina. Un evento para compartir con nuestra comunidad el conocimiento y la experiencia de los expertos que están creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. Te esperamos!</p>\r\n");
      out.write("		                                <p><a class=\"btn btn-outline-light mb-3\" href=\"#form-orador\">Quiero ser orador</a> <a class=\"btn btn-success ms-2 mb-3\" href=\"comprar-tickets.html\">Comprar tickets</a></p>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"carousel-item bg-carousel-ba2\">\r\n");
      out.write("		                <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><rect width=\"100%\" height=\"100%\" fill=\"#000\"/></svg>\r\n");
      out.write("		                <div class=\"container\">\r\n");
      out.write("		                    <div class=\"carousel-caption text-end pb-5\">\r\n");
      out.write("		                        <div class=\"row\">\r\n");
      out.write("		                            <div class=\"col-lg-6 offset-lg-6\">\r\n");
      out.write("		                                <h3>Conf Bs. As.</h3>\r\n");
      out.write("		                                <p>Bs. As. llega por primera vez a la Argentina. Un evento para compartir con nuestra comunidad el conocimiento y la experiencia de los expertos que están creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. Te esperamos!</p>\r\n");
      out.write("		                                <p><a class=\"btn btn-outline-light mb-3\" href=\"#form-orador\">Quiero ser orador</a> <a class=\"btn btn-success ms-2 mb-3\" href=\"comprar-tickets.html\">Comprar tickets</a></p>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"carousel-item bg-carousel-ba3\">\r\n");
      out.write("		                <svg class=\"bd-placeholder-img\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" aria-hidden=\"true\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><rect width=\"100%\" height=\"100%\" fill=\"#000\"/></svg>\r\n");
      out.write("		                <div class=\"container\">\r\n");
      out.write("		                    <div class=\"carousel-caption text-end pb-5\">\r\n");
      out.write("		                        <div class=\"row\">\r\n");
      out.write("		                            <div class=\"col-lg-6 offset-lg-6\">\r\n");
      out.write("		                                <h3>Conf Bs. As.</h3>\r\n");
      out.write("		                                <p>Bs. As. llega por primera vez a la Argentina. Un evento para compartir con nuestra comunidad el conocimiento y la experiencia de los expertos que están creando el futuro de internet. Ven a conocer a miembros del evento, a otros estudiantes de Codo a Codo y a los oradores de primer nivel que tenemos para ti. Te esperamos!</p>\r\n");
      out.write("		                                <p><a class=\"btn btn-outline-light mb-3\" href=\"#form-orador\">Quiero ser orador</a> <a class=\"btn btn-success ms-2 mb-3\" href=\"comprar-tickets.html\">Comprar tickets</a></p>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("		        </div>\r\n");
      out.write("		        <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide=\"prev\">\r\n");
      out.write("		            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("		            <span class=\"visually-hidden\">Anterior</span>\r\n");
      out.write("		        </button>\r\n");
      out.write("		        <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide=\"next\">\r\n");
      out.write("		            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("		            <span class=\"visually-hidden\">Siguiente</span>\r\n");
      out.write("		        </button>\r\n");
      out.write("		    </div>\r\n");
      out.write("		\r\n");
      out.write("		    <section class=\"container mb-4\" id=\"oradores\">\r\n");
      out.write("		        <h2 class=\"titulo-gral\">Conoce a los <span>oradores</span></h2>\r\n");
      out.write("		\r\n");
      out.write("		        <div class=\"row justify-content-center\">\r\n");
      out.write("		            <div class=\"col-md-11\">\r\n");
      out.write("		                <div class=\"row row-cols-1 row-cols-md-3 g-4\">\r\n");
      out.write("		                    <div class=\"col\">\r\n");
      out.write("		                        <div class=\"card h-100\">\r\n");
      out.write("		                            <img src=\"img/steve-min.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("		                            <div class=\"card-body\">\r\n");
      out.write("		                                <div class=\"mb-2\">\r\n");
      out.write("		                                    <span class=\"badge bg-warning text-dark\">Javascript</span>\r\n");
      out.write("		                                    <span class=\"badge bg-info\">React</span>\r\n");
      out.write("		                                </div>\r\n");
      out.write("		                                <h5 class=\"card-title\">Steve Jobs</h5>\r\n");
      out.write("		                                <p class=\"card-text\">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Et aspernatur, sit dolorem officiis dolor, nobis sed labore non culpa dignissimos amet excepturi odit quis quos temporibus ut asperiores possimus. Veniam!</p>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                    <div class=\"col\">\r\n");
      out.write("		                        <div class=\"card h-100\">\r\n");
      out.write("		                            <img src=\"img/bill-min.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("		                            <div class=\"card-body\">\r\n");
      out.write("		                                <div class=\"mb-2\">\r\n");
      out.write("		                                    <span class=\"badge bg-warning text-dark\">Javascript</span>\r\n");
      out.write("		                                    <span class=\"badge bg-info\">React</span>\r\n");
      out.write("		                                </div>\r\n");
      out.write("		                                <h5 class=\"card-title\">Bill Gates</h5>\r\n");
      out.write("		                                <p class=\"card-text\">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Molestias, nostrum saepe et quaerat illo possimus provident laboriosam totam sunt magni recusandae eligendi optio earum quas ab omnis fuga molestiae corrupti.</p>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                    <div class=\"col\">\r\n");
      out.write("		                        <div class=\"card h-100\">\r\n");
      out.write("		                            <img src=\"img/ada-min.jpeg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("		                            <div class=\"card-body\">\r\n");
      out.write("		                                <div class=\"mb-2\">\r\n");
      out.write("		                                    <span class=\"badge bg-secondary\">Negocios</span>\r\n");
      out.write("		                                    <span class=\"badge bg-danger\">Startups</span>\r\n");
      out.write("		                                </div>\r\n");
      out.write("		                                <h5 class=\"card-title\">Ada Lovelace</h5>\r\n");
      out.write("		                                <p class=\"card-text\">Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolores, veniam eius excepturi sapiente eligendi quaerat soluta nihil iste vero sequi cum nam quibusdam quam voluptas consequuntur natus! Optio, perspiciatis velit.</p>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                </div>\r\n");
      out.write("		            </div>\r\n");
      out.write("		        </div>\r\n");
      out.write("		\r\n");
      out.write("		    </section>\r\n");
      out.write("		    <section class=\"container mb-4 text-center\" id=\"restoOradores\">\r\n");
      out.write("		       <a class=\"btn btn-outline-success\" href=\"");
      out.print(request.getContextPath());
      out.write("/FindAllOradorController\">Conoce al resto de los ORADORES</a>\r\n");
      out.write("		\r\n");
      out.write("		    </section>\r\n");
      out.write("		\r\n");
      out.write("		    <section class=\"mb-4\" id=\"lugar\">\r\n");
      out.write("		        <div class=\"row g-0\">\r\n");
      out.write("		            <div class=\"col-md\">\r\n");
      out.write("		                <img src=\"img/honolulu-min.jpg\" alt=\"Honolulu\" class=\"img-fluid\">\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"col-md text-light bg-aside1\">\r\n");
      out.write("		                <h2>Bs As - Octubre</h2>\r\n");
      out.write("		                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. At placeat molestias vitae unde facere voluptatem minus voluptates commodi corrupti tenetur! Pariatur qui enim animi sapiente sed error similique molestiae ipsum! Lorem, ipsum dolor sit amet consectetur adipisicing elit. Perspiciatis, excepturi deleniti harum facilis id, a illo assumenda officiis illum praesentium eos. Qui laborum ratione in hic ducimus debitis voluptatum aperiam.</p>\r\n");
      out.write("		                <a class=\"btn btn-outline-light\" href=\"#\">Conocé más</a>\r\n");
      out.write("		            </div>\r\n");
      out.write("		        </div>\r\n");
      out.write("		    </section>\r\n");
      out.write("		\r\n");
      out.write("		    <section class=\"container\" id=\"form-orador\">\r\n");
      out.write("		        <div class=\"row justify-content-center\">\r\n");
      out.write("		            <div class=\"col-lg-8 col-xl-7\">\r\n");
      out.write("		                <h2 class=\"titulo-gral\">Conviértete en un <span>orador</span></h2>\r\n");
      out.write("		                <p class=\"text-center\">Anótate como orador para dar una charla ignite. Cuéntanos de qué quieres hablar!</p>\r\n");
      out.write("		                <form action=\"");
      out.print(request.getContextPath());
      out.write("/CreateOradorController\" method=\"POST\">\r\n");
      out.write("		                    <div class=\"row gx-2\">\r\n");
      out.write("		                        <div class=\"col-md mb-3\">\r\n");
      out.write("		                            <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"Nombre\" aria-label=\"Nombre\" required>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                        <div class=\"col-md mb-3\">\r\n");
      out.write("		                            <input type=\"text\" class=\"form-control\" name=\"apellido\" placeholder=\"Apellido\" aria-label=\"Apellido\" required>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                    <div class=\"row\">\r\n");
      out.write("		                        <div class=\"col mb-3\">\r\n");
      out.write("		                            <input type=\"email\" class=\"form-control\" name=\"mail\" placeholder=\"Email\" aria-label=\"Email\" required>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                    <div class=\"row\">\r\n");
      out.write("		                        <div class=\"col mb-3\">\r\n");
      out.write("		                            <textarea class=\"form-control\" name=\"tema\" id=\"exampleFormControlTextarea1\" rows=\"4\"\r\n");
      out.write("		                                placeholder=\"Sobre qué quieres hablar?\" required></textarea>\r\n");
      out.write("		                            <div id=\"emailHelp\" class=\"form-text mb-3\">Recuerda incluir un título para tu charla.</div>\r\n");
      out.write("		                            <div class=\"d-grid\">\r\n");
      out.write("		                                <button type=\"submit\" class=\"btn btn-lg btn-form\">Enviar</button>\r\n");
      out.write("		                            </div>\r\n");
      out.write("		                        </div>\r\n");
      out.write("		                    </div>\r\n");
      out.write("		                </form>\r\n");
      out.write("		            </div>\r\n");
      out.write("		        </div>\r\n");
      out.write("		    </section>\r\n");
      out.write("		\r\n");
      out.write("		</main>\r\n");
      out.write("		\r\n");
      out.write("		<footer id=\"main-footer\">\r\n");
      out.write("		    <div class=\"container\">\r\n");
      out.write("		        <ul class=\"nav justify-content-center justify-content-lg-between align-items-center\">\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Preguntas <span>frecuentes</span></a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Contáctanos</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Prensa</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Conferencias</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Términos y <span>condiciones</span></a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Privacidad</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		            <li class=\"nav-item\">\r\n");
      out.write("		                <a class=\"nav-link\" href=\"#\">Estudiantes</a>\r\n");
      out.write("		            </li>\r\n");
      out.write("		        </ul>\r\n");
      out.write("		    </div>\r\n");
      out.write("		</footer>\r\n");
      out.write("		\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
