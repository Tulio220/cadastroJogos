/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-10-02 00:06:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.trabalhoEly.cadastro;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;
import org.libertas.Jogo;
import org.libertas.JogoDao;

public final class add_005fjogo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("org.libertas.Jogo");
    _jspx_imports_classes.add("org.libertas.JogoDao");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Adicionar Jogo</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-color: #f0f8ff;\r\n");
      out.write("            font-family: 'Arial', sans-serif;\r\n");
      out.write("            animation: fadeIn 1s ease-in;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("            color: #333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-control {\r\n");
      out.write("            border-radius: 25px;\r\n");
      out.write("            transition: all 0.3s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-control:focus {\r\n");
      out.write("            border-color: #007bff;\r\n");
      out.write("            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-primary {\r\n");
      out.write("            border-radius: 25px;\r\n");
      out.write("            transition: background-color 0.3s, transform 0.2s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-primary:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-default {\r\n");
      out.write("            border-radius: 25px;\r\n");
      out.write("            transition: background-color 0.3s, transform 0.2s;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn-default:hover {\r\n");
      out.write("            background-color: #e0e0e0;\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @keyframes fadeIn {\r\n");
      out.write("            from {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("            }\r\n");
      out.write("            to {\r\n");
      out.write("                opacity: 1;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container {\r\n");
      out.write("            margin-top: 50px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            background-color: white;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2 class=\"text-center\">Adicionar Jogo</h2>\r\n");
      out.write("        \r\n");
      out.write("        ");

            int id = 0;
            String idParam = request.getParameter("id");
            if (idParam != null && !idParam.isEmpty()) {
                id = Integer.parseInt(idParam);
            }
            Jogo j = new Jogo();
            JogoDao jdao = new JogoDao();
            if (id > 0) {
                j = jdao.consultar(id);
            } else {
                j.setNome("");
                j.setPlataforma("");
                j.setGenero("");
                j.setAnoLancamento(0);
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <form action=\"gravar.jsp\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print( j.getId() );
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"nome\" class=\"col-sm-2 control-label\">Nome:</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"nome\" name=\"nome\" value=\"");
      out.print( j.getNome() );
      out.write("\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"plataforma\" class=\"col-sm-2 control-label\">Plataforma:</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"plataforma\" name=\"plataforma\" value=\"");
      out.print( j.getPlataforma() );
      out.write("\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"genero\" class=\"col-sm-2 control-label\">Gênero:</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"genero\" name=\"genero\" value=\"");
      out.print( j.getGenero() );
      out.write("\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"ano_lancamento\" class=\"col-sm-2 control-label\">Ano de Lançamento:</label>\r\n");
      out.write("                <div class=\"col-sm-10\">\r\n");
      out.write("                    <input type=\"number\" class=\"form-control\" id=\"ano_lancamento\" name=\"ano_lancamento\" value=\"");
      out.print( j.getAnoLancamento() );
      out.write("\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Salvar</button>\r\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-default\">Cancelar</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
