package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class iniciosesion_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"Stylees/estilosAP.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>Inicio</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <h1 class=\"textopri\">Inicio de Sesion</h1>\r\n");
      out.write("                <img class=\"bodini\" src=\"./images/car-gto.jpg\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <form class=\"formu_ini\" action=\"Acceder\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("                    <label class=\"boxini\">Documento</label><br>\r\n");
      out.write("                    <input class=\"texini\" type=\"text\" name=\"Documento\" placeholder=\"digite numero\" required pattern=\"[0-9]{3,15}\" title=\"debe contener minimo 4 numeros\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <label class=\"boxini\">Clave</label><br>\r\n");
      out.write("                    <input class=\"texini\" type=\"password\" name=\"Clave\" placeholder=\"digite contraseña\" required pattern=\"[A-Za-z0-9]{3,8}\" title=\"debe contener minimo 6letras (AZ,aa,0-9)\">\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <input class=\"inpin\" type=\"submit\" value=\"Iniciar Sesion\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <h2 class=\"subtitini\">Agil, seguro y confiable</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <footer class=\"footini\"> AgilePark  2019</footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
