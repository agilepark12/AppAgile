package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regisEmpresa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"bodem\">\n");
      out.write("\n");
      out.write("<center><h1 class=\"textopri\">Formulario de Registro Cliente Empresa</h1></center>\n");
      out.write("\n");
      out.write("<form name=\"formu\" class=\"formu_2\" action=\"RegisEm\" method=\"post\">\n");
      out.write("    <label class=\"boxre\">placa</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"placa-e\" placeholder=\" placa \" required pattern=\"[A-Z0-9]{6,8}\" title=\"ingrese texto en MAYUSCULAS\"><br>\n");
      out.write("    <label class=\"boxre\">Nombre</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"nom_e\" placeholder=\" nombre \" required pattern=\"[A-Z]{3,15}\" title=\"debe contener minimo 3 letras en MAYUSCULAS\"><br>\n");
      out.write("    <label class=\"boxre\">Apellido</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"ape_e\"  placeholder=\" apellido \" required pattern=\"[A-Z]{3,15}\" title=\"debe contener minimo 3 letras en MAYUSCULAS\"><br>\n");
      out.write("    <label class=\"boxre\">TipoDocumneto</label>\n");
      out.write("    <select class=\"selusu\" name=\"tipodoc-e\" size=\"2\"   required >\n");
      out.write("        <option value=\"1\">pasaporte</option>\n");
      out.write("        <option value=\"2\">cedula</option>\n");
      out.write("        <option value=\"3\">tarjeta Identidad</option>\n");
      out.write("        <option value=\"4\">cedula de extranjeria</option>      \n");
      out.write("    </select><br>\n");
      out.write("    <br>\n");
      out.write("    <br>    \n");
      out.write("    <label class=\"boxre\">Documento</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"doc-e\" pattern=\"[0-9]{4,15}\"  title=\"debe contener minomo 4 numeros\" placeholder=\"Documento\" required ><br>\n");
      out.write("    <label class=\"boxre\">Departamento</label>\n");
      out.write("    <select class=\"selusu\" name=\"depa-e\" size=\"2\" required>\n");
      out.write("        <option value=\"1\"> of. cartera </option>\n");
      out.write("        <option value=\"2\"> of. compras </option>\n");
      out.write("        <option value=\"3\"> of. tecnologia </option>\n");
      out.write("        <option value=\"4\"> of. tesoreria </option>\n");
      out.write("        <option value=\"5\"> of. gerencia </option>\n");
      out.write("        <option value=\"6\"> of. diseño </option>\n");
      out.write("        <option value=\"7\"> of. atencion al cliente </option>\n");
      out.write("    </select><br><br>\n");
      out.write("    <br>\n");
      out.write("    <input class=\"inpre\" type=\"submit\" value=\"Registrar\" >\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <input class=\"volver\" type=\"button\" value=\"menu\" onClick=\"location.href = 'menu.jsp'\">\n");
      out.write("    <br>\n");
      out.write("</form>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("</body>\n");
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
