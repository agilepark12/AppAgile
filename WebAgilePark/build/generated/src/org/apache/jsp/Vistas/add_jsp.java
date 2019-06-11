package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>regisEmpresa</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Agregar Cliente</h1>\n");
      out.write("        <form action=\"Controlador\">\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txtname\">Nombre</label>\n");
      out.write("                <input type=\"text\"  name=\"txtname\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txtlast\">Apellido</label>\n");
      out.write("                <input type=\"text\" name=\"txtlast\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txttipo\" >Tipo Documento</label>\n");
      out.write("                <select name=\"txttipo\">\n");
      out.write("                    <option value=\"1\">pasaporte</option>\n");
      out.write("                    <option value=\"2\">cedula</option>\n");
      out.write("                    <option value=\"3\">tarjeta Identidad</option>\n");
      out.write("                    <option value=\"4\">cedula de extranjeria</option>    \n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txtdoc\" >Documento</label>\n");
      out.write("                <input type=\"text\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txtdep\" >Departamento</label>\n");
      out.write("                <select name=\"txtdep\">\n");
      out.write("                    <option value=\"1\"> of. Cartera </option>\n");
      out.write("                    <option value=\"2\"> of. Compras </option>\n");
      out.write("                    <option value=\"3\"> of. Tecnologia </option>\n");
      out.write("                    <option value=\"4\"> of. Tesoreria </option>\n");
      out.write("                    <option value=\"5\"> of. Gerencia </option>\n");
      out.write("                    <option value=\"6\"> of. Diseño </option>\n");
      out.write("                    <option value=\"7\"> of. Atencion al cliente </option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label for=\"txtplaca\" >Placa</label>\n");
      out.write("                <input type=\"text\" name=\"txtplaca\">\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <input class=\"inpre\" type=\"submit\" name=\"accion\" value=\"Registrar\" >\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input class=\"volver\" type=\"button\" value=\"menu\" onClick=\"location.href = 'index.jsp'\">\n");
      out.write("            <br>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
