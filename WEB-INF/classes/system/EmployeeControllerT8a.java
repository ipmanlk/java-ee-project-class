package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import system.EmployeeDao;
import com.google.gson.*;

public class EmployeeControllerT8a extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      PrintWriter out = res.getWriter();

      List <Employee> employees = EmployeeDao.getAll();
      Gson json = new Gson();
      String employee = json.toJson(employees);
      out.println(employee);
  }
}