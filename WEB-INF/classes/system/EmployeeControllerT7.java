package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import system.EmployeeDao;

public class EmployeeControllerT7 extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      List <Employee> employees = EmployeeDao.getAll();

      req.setAttribute("employees", employees);
      req.getRequestDispatcher("t7.jsp").forward(req, res);
  }
}