package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class validAuto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body class=\"bodem_1\">\n");
      out.write("\n");
      out.write("<center><h1 class=\"textopri\">Formulario de Registro Cliente Empresa</h1></center>\n");
      out.write("<form class=\"formu_1\" action=\"ConsultarPlaca\" method=\"post\">\n");
      out.write("    <label class=\"boxre\">Placa</label>\n");
      out.write("    <input class=\"texre\" type=\"text\" name=\"Placa\" placeholder=\"placa\" required pattern=\"[A-Z0-9]{6,8}\" title=\"ingrese solo mayusculas\"><br>\n");
      out.write("    <input class=\"inpre\" name=\"xx\" type=\"submit\" value=\"consultar\" onClick=\"document.formu.xx.disabled\">\n");
      out.write("</form>\n");
      out.write("</body>\n");
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
