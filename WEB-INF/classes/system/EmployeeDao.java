package system;

import java.util.*;
import system.Employee;
import java.sql.*;

public class EmployeeDao {
  public static List <Employee> getAll() {
    List <Employee> employees = new ArrayList<Employee>();

    try {
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
      Statement st = connection.createStatement();
      String query  = "SELECT * FROM employee";
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setNic(rs.getString("nic"));
        employees.add(employee);
      }
    }

    catch(Exception ex) {
      System.out.println(ex.getMessage());
    }

    return employees;
  }
}