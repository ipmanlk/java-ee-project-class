<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>
<%@ page import = "java.util.*"%>
<%@ page import = "system.*"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
      <%
        out.println("<h1>Employee Details</h1>");
        out.println("<table border=1><tr><th>Name</th><th>NIC</th></tr>");
        List <Employee> employees = (List <Employee>) request.getAttribute("employees");
        for (Employee employee : employees) {
          out.println("<tr><td>" + employee.getName() + "</td><td>" + employee.getNic() + "</td></tr>");
        }
        out.println("</table>");
      %>
  </body>
</html>