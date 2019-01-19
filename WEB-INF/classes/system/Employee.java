package system;

public class Employee {
  int id;
  String name;
  String nic;

  public Employee() {

  }

  public Employee(int id, String name, String nic) {
    this.id = id;
    this.name = name;
    this.nic = nic;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setNic(String nic) {
    this.nic = nic;
  }

  public String getNic() {
    return this.nic;
  }
}