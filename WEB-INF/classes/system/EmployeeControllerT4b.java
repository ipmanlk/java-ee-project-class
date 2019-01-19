package system;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
import java.sql.*;

public class EmployeeControllerT4b extends HttpServlet{
  public void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
  {
      PrintWriter out = res.getWriter();
      try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
        Statement st = connection.createStatement();
        String name = req.getParameter("name");
        String query  = "SELECT * FROM employee WHERE name LIKE '%" + name + "%'";
        ResultSet rs = st.executeQuery(query);

        out.println("<h1>T4: T3 + Database</h1>");
        out.println("<h1>Employee Details</h1>");
        out.println("<table border=1><tr><th>Name</th><th>NIC</th></tr>");
        while(rs.next()) {
          out.println("<tr><td>" + rs.getString("name") + "</td><td>" + rs.getString("nic") + "</td></tr>");
        }
      }

      catch(Exception ex) {
        System.out.println(ex.getMessage());
      }
      out.println("</table>");
      out.close();
  }
}