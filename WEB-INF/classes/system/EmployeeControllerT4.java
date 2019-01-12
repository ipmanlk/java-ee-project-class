package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class EmployeeControllerT4 extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      PrintWriter out = res.getWriter();
      out.println("<h1>T4: T3 + Database</h1>");
      out.println("<h1>Employee Details</h1>");
      out.println("<table border=1><tr><th>Name</th><th>NIC</th></tr><tr><td>Wanasara</td><td>123</td></tr></table>");
      out.close();
  }
}