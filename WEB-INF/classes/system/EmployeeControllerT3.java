package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class EmployeeControllerT3 extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      PrintWriter out = res.getWriter();
      out.println("<h1>T3: Dynamic webpage with servlet</h1>");
      out.close();
  }
}