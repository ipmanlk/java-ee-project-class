package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import system.EmployeeDao;

public class EmployeeControllerT6 extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      PrintWriter out = res.getWriter();
      out.println("<h1>Employee Details</h1>");
      out.println("<table border=1><tr><th>Name</th><th>NIC</th></tr>");

      List <Employee> employees = EmployeeDao.getAll();
      for (Employee employee: employees) {
        out.println("<tr><td>" + employee.getName() + "</td><td>" + employee.getNic() + "</td></tr>");
      }
      out.println("</table>");
      out.close();
  }
}