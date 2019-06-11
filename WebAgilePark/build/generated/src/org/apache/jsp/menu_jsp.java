package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Stylees/estilosAP.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>menu</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"inicio\">\n");
      out.write("    <center><h1 class=\"textopri\">Control de Estacionamiento</h1><h4>!AGILE-PARK</h4></center>\n");
      out.write("\n");
      out.write("    <table id=\"colorbox\" class=\"azul\">\n");
      out.write("        <div id=\"menu\">\n");
      out.write("\n");
      out.write("            <ul class=\"green\">\n");
      out.write("                <li><a href=\"menu.jsp\"> inicio </a></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"menu.jsp\"> usuarios </a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"iniciosesion.jsp\"> abrir sesion </a></li>\n");
      out.write("                        <li><a href=\"iniciosesion.jsp\">cerrar sesion</a></li>\n");
      out.write("                        <li><a href=\"regisUsuario.jsp\"> crear usuario </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"menu.jsp\"> Cliente </a>\n");
      out.write("                    <ul>                                                    \n");
      out.write("                        <li><a href=\"regisVehiculo.jsp\">vehiculo</a></li>\n");
      out.write("                        <li><a href=\"validAuto.jsp\">empresa</a></li>                           \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"ing\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"menu.jsp\"> Bienvenido:  ");
out.println();
      out.write("</a>\n");
      out.write("                    <ul>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <table>\n");
      out.write("        <div class=\"foo\">\n");
      out.write("            <div class=\"footer\" ><h2> MISION: </h2>\n");
      out.write("                <h3>Fragmento de un escrito con unidad temática, que queda diferenciado del resto de fragmentos\n");
      out.write("                    por un punto y aparte y generalmente también por llevar letra mayúscula inicial y un espacio \n");
      out.write("                    en blanco en el margen izquierdo de alineación del texto principal de la primera línea parágrafo\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer2\" ><h2> VISION: </h2>\n");
      out.write("                <h3>Fragmento de un escrito con unidad temática, que queda diferenciado del resto de fragmentos\n");
      out.write("                    por un punto y aparte y generalmente también por llevar letra mayúscula inicial y un espacio \n");
      out.write("                    en blanco en el margen izquierdo de alineación del texto principal de la primera línea parágrafo\n");
      out.write("                </h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
