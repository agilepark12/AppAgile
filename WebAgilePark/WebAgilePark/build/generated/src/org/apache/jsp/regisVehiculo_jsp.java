package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regisVehiculo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><link href=\"Stylees/estilosAP.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>menu</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"inicio\">\n");
      out.write("        <h1 class=\"textopri\">Control de Estacionamiento</h1>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navegador</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item \" >\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" onClick=\"location.href = 'iniciosesion.jsp'\" >Inicio <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Estado</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Clientes\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"regisVehiculo.jsp\">Cliente dia</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"validAuto.jsp\">Cliente empresa</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            Administracion\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"regisUsuario.jsp\">Crear usuario</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Eliminar usuario</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Actualizar usuario</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Control</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <div>\n");
      out.write("                        <h2><span class=\"badge badge-info\">nombre de usuario</span></h2>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron jumbotron-fluid jumbotron-ing\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"texto\" >Formulario de Registro Vehiculos Diarios</h1>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <form action=\"vehiculo\" method=\"post\" class=\"form-ing\" >\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label for=\"placa_E\">Placa</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"pla\"  id=\"placa_E\" pattern=\"[A-Z0-9A-Z]{6,8}\"  placeholder=\"Placa\" required style=\"text-transform: uppercase \">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-6\">\n");
      out.write("                            <label for=\"Marca_E\">Marca</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"mar\" id=\"Marca_E\" placeholder=\"Marca\" required pattern=\"[A-Z]{2,15}\" style=\"text-transform: uppercase \">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                        <div class=\"form-group col-md-4\">\n");
      out.write("                            <label for=\"inputState\">Color</label>\n");
      out.write("                            <select  class=\"form-control\"  name=\"col\" size=\"1\" required title=\"debe seleccionar un color\">\n");
      out.write("                                <option selected>Selecciona...</option>\n");
      out.write("                                <option value=\"beige\">beige</option>\n");
      out.write("                                <option value=\"negro\">negro</option>\n");
      out.write("                                <option value=\"azul\">azul</option>\n");
      out.write("                                <option value=\"marron\">marron</option>\n");
      out.write("                                <option value=\"plateado\">plateado</option>\n");
      out.write("                                <option value=\"naranja\">naranjado</option>\n");
      out.write("                                <option value=\"blanco\">blanco</option>\n");
      out.write("                                <option value=\"gris\">gris</option>\n");
      out.write("                                <option value=\"crema\">crema</option>\n");
      out.write("                                <option value=\"dorado\">dorado</option>\n");
      out.write("                                <option value=\"amarillo\">amarillo</option>\n");
      out.write("                                <option value=\"morado\">morado</option>\n");
      out.write("                                <option value=\"vinotinto\">vinotinto</option>\n");
      out.write("                                <option value=\"verde\">verde</option>\n");
      out.write("                                <option value=\"otro\">otro</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group col-md-4\">\n");
      out.write("                            <label for=\"inputState\">Tipo Vehiculo</label>\n");
      out.write("                            <select  class=\"form-control\"  name=\"tipo\" size=\"1\" required title=\"debe realizar una seleccion\">\n");
      out.write("                                <option selected>Selecciona..</option>\n");
      out.write("                                <option value=\"1\">bicicleta</option>\n");
      out.write("                                <option value=\"2\">moto</option>\n");
      out.write("                                <option value=\"3\">auto</option>\n");
      out.write("                                <option value=\"4\">camioneta</option>\n");
      out.write("                                <option value=\"5\">pesado</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <label>Foto del Vehiculo</label>\n");
      out.write("                    \n");
      out.write("                    <div class=\"custom-file filing\">\n");
      out.write("                        <input  type=\"file\" class=\"custom-file-input\" accept=\"image/*\"  name=\"foto\" id=\"validatedCustomFile\" required title=\"debe cargar la foto \">\n");
      out.write("                        <label class=\"custom-file-label\"  for=\"validatedCustomFile\" >Buscar archivo...  </label>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                  \n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info\" value=\"Registrar\">Registrar</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-info\" value=\"Volver\" onClick=\"location.href = 'menu.jsp'\">Volver</button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"footini\"> AgilePark  2019</footer>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
