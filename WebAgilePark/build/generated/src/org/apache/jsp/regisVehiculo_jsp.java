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
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Stylees/estilosAP.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>regisVehiculo</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"bodreg\">\n");
      out.write("\n");
      out.write("<center><h1 class=\"textopri\">Formulario de Registro Vehiculos Diarios</h1></center>\n");
      out.write("<form class=\"formu_reg\" action=\"vehiculo\" method=\"post\">\n");
      out.write("    <label class=\"boxre\">Color</label>\n");
      out.write("    <select class=\"selre\" name=\"col\" size=\"2\" required title=\"debe seleccionar un color\">\n");
      out.write("        <option value=\"beige\">beige</option>\n");
      out.write("        <option value=\"negro\">negro</option>\n");
      out.write("        <option value=\"azul\">azul</option>\n");
      out.write("        <option value=\"marron\">marron</option>\n");
      out.write("        <option value=\"plateado\">plateado</option>\n");
      out.write("        <option value=\"naranja\">naranjado</option>\n");
      out.write("        <option value=\"blanco\">blanco</option>\n");
      out.write("        <option value=\"gris\">gris</option>\n");
      out.write("        <option value=\"crema\">crema</option>\n");
      out.write("        <option value=\"dorado\">dorado</option>\n");
      out.write("        <option value=\"amarillo\">amarillo</option>\n");
      out.write("        <option value=\"morado\">morado</option>\n");
      out.write("        <option value=\"vinotinto\">vinotinto</option>\n");
      out.write("        <option value=\"otro\">otro</option>\n");
      out.write("    </select><br>\n");
      out.write("    <br>\n");
      out.write("    <label class=\"boxre\">Placa</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"pla\"  id=\"placa_E\" pattern=\"[A-Z0-9]{6,8}\"  placeholder=\"Placa\" required title=\"debe contener mayusculas\"><br>\n");
      out.write("    <label class=\"boxre\">Marca</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"mar\" placeholder=\"Marca\" required pattern=\"[a-z]{3,15}\" title=\"debe ingresar la marca del vehiculo\"><br>\n");
      out.write("\n");
      out.write("    <label class=\"boxre\">Foto</label>\n");
      out.write("    <div id=\"div-file\">\n");
      out.write("        <input id=\"addfile\" placeholder=\"Añadir Foto\"> </input>\n");
      out.write("    <input class=\"file-input\" id=\"btn\" type=\"file\" accept=\"image/*\"  name=\"foto\" placeholder=\"foto\" required title=\"debe cargar la foto\"><br>\n");
      out.write("    </div>\n");
      out.write("    <label class=\"boxre\">Clase</label>\n");
      out.write("    <select class=\"selre\"  name=\"tipo\" size=\"2\" required title=\"debe realizar una seleccion\">\n");
      out.write("        <option value=\"1\">bicicleta</option>\n");
      out.write("        <option value=\"2\">moto</option>\n");
      out.write("        <option value=\"3\">auto</option>\n");
      out.write("        <option value=\"4\">camioneta</option>\n");
      out.write("        <option value=\"5\">pesado</option>\n");
      out.write("    </select><br>\n");
      out.write("    <br> \n");
      out.write("    <br>\n");
      out.write("    <input class=\"inpre\" type=\"submit\" value=\"Registrar\" >\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <input class=\"inpre\" type=\"button\" value=\"   volver  \" onClick=\"location.href = 'menu.jsp'\"\">\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</body>\n");
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
