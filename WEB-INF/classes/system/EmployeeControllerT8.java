package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import system.EmployeeDao;

public class EmployeeControllerT8 extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      PrintWriter out = res.getWriter();

      List <Employee> employees = EmployeeDao.getAll();
      int count = 1;
      int size = employees.size();

      out.print("[");
      for (Employee employee: employees) {
        out.print("{\"name\":\"" + employee.getName() + "\",\"nic\":\"" + employee.getNic() + "\"}");
        if (count < size) {
          out.print(",");
          count = count + 1;
        }
      }
      out.println("}");
  }
}