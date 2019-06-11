package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regisUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>regisUsuario</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body class=\"bodusu\">\n");
      out.write("\n");
      out.write("    <center><h1 class=\"textopri\">Formulario control de Usuarios</h1></center>\n");
      out.write("    <form class=\"formu_usu\" action=\"usuario\" method=\"post\">\n");
      out.write("        <label class=\"boxre\">Nombre</label>\n");
      out.write("        <input class=\"texre\" type=\"text\" name=\"Nombre\" pattern=\"[a-z]{4,15}\"  title=\"unicamente letras\" placeholder=\"Nombre\" required title=\"debe ingresar nombre\"><br>\n");
      out.write("        <label class=\"boxre\">Apellido</label>\n");
      out.write("        <input class=\"texre\" type=\"text\" name=\"Apellido\" pattern=\"[a-z]{4,15}\"  title=\"unicamente letras\" placeholder=\"Apellido\" required title=\"debe ingresar apellido\"><br>\n");
      out.write("        <label class=\"boxre\">Tipo documento</label>\n");
      out.write("        <select class=\"selusu\" name=\"Tipodocumento\" size=\"2\" required=\"\" title=\"debe seleccinar un tipo de documento\">\n");
      out.write("            <option value=\"1\">pasaporte</option>\n");
      out.write("            <option value=\"2\">cedula</option>\n");
      out.write("            <option value=\"3\">tarjeta Identidad</option>\n");
      out.write("            <option value=\"4\">cedula de extranjeria</option>      \n");
      out.write("        </select><br>\n");
      out.write("        <br>\n");
      out.write("        <br>    \n");
      out.write("        <label class=\"boxre\">Documento</label>\n");
      out.write("        <input class=\"texre\" type=\"text\" name=\"Documento\" pattern=\"[0-9]{4,15}\"  title=\"unicamente numeros\" placeholder=\"Documento\" required title=\"debe contener minimo 4 numeros\"><br>\n");
      out.write("        <label class=\"boxre\">Clave</label>\n");
      out.write("        <input class=\"texre\" type=\"password\" name=\"Clave\" pattern=\"[A-Za-z0-9]{6,8}\" \n");
      out.write("               title=\"debe ser una calve compuesta de mayusculas, minusculas y numeros en orden aleatorio\" \n");
      out.write("               placeholder=\"Clave\" required><br>\n");
      out.write("        <label class=\"boxre\">Tipo</label>\n");
      out.write("        <select class=\"selog\" name=\"Tipologis\" size=\"2\" required title=\"debe seleccionar un departamento\">\n");
      out.write("            <option value=\"1\">SuperAdmin</option>\n");
      out.write("            <option value=\"2\">Admin</option>\n");
      out.write("            <option value=\"3\">Logistico</option>\n");
      out.write("        </select><br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <input class=\"inpre\" type=\"submit\" value=\"Registrar\"><br>\n");
      out.write("        <br>\n");
      out.write("        <input class=\"volver\" type=\"button\" value=\"menu\" onClick=\"location.href='menu.jsp'\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </form>\n");
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
