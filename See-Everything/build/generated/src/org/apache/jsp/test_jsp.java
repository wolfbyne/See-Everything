package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"                                                    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<table border=\"2\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>ID</td>\r\n");
      out.write("<td>NAME</td>\r\n");
      out.write("<td>SKILL</td>\r\n");
      out.write("<td>ACTION</td>\r\n");
      out.write("<td>ACTION</td>\r\n");
      out.write("<td>ACTION</td>\r\n");
      out.write("</tr>\r\n");

try
{
Class.forName("org.sqlite.JDBC");
String url="jdbc:sqlite:C://Users/flemi/Documents/GitHub/See-Everything/See-Everything/SJC_DB.db";
String query="select * from tblTimeTablesLocation";
Connection conn=DriverManager.getConnection(url);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{


      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>");
      out.print(rs.getInt("StaffID") );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("Week") );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("Weekday") );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("period") );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("venue") );
      out.write("</td>\r\n");
      out.write("    <td>");
      out.print(rs.getString("WeekDayCode") );
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("        ");


}

      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    ");

    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }





      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</html> ");
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
