<%@ page import = "java.sql.*"%>
<%@ page import = "java.io.*"%>
<%@ page import = "java.util.*"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
  </head>
  <body>
    <h1>
      <% out.println("T5: Dynamic Web Page Request with DB using embeded"); %>
      <%
      try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
        Statement st = connection.createStatement();
        String query  = "SELECT * FROM employee";
        ResultSet rs = st.executeQuery(query);

        out.println("<h1>Employee Details</h1>");
        out.println("<table border=1><tr><th>Name</th><th>NIC</th></tr>");
        while(rs.next()) {
          out.println("<tr><td>" + rs.getString("name") + "</td><td>" + rs.getString("nic") + "</td></tr>");
        }
      }

      catch(Exception ex) {
        out.println(ex.getMessage());
      }
      out.println("</table>");

      %>
    </h1>
  </body>
</html>