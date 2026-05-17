package Departament;

import java.util.Objects;

public class Employee {
  private String name;
  private Department department;

  public String getName() {
    return name;
  }

  // FIXME: проверка на пустую строку через isEmpty(), отступы 2 пробела
  /*
    public void setName(String name) {
        if(name == null || name.length() == 0){
            this.name = "unknown";
        } else {
            this.name = name;
        }
    }
  */

  // FIXTO:
  public void setName(String name) {
    if (name == null || name.isEmpty()) {
      this.name = "unknown";
    } else {
      this.name = name;
    }
  }

  public Department getDepartment() {
    if (this.department == null) {
      return null;
    } else {
      return new Department(department);
    }
  }

  Department getRefDepartment() {
    return this.department;
  }

  void setDepartment(Department department) {
    this.department = department;
  }

  public Employee() {
    this.name = "unknown";
    this.department = null;
  }

  public Employee(String name) {
    this.setName(name);
    this.department = null;
  }

  public Employee(String name, Department department) {
    this.setName(name);
    if (department != null) {
      department.addEmployee(this);
    }
  }
  
  public Employee(Employee copyEmployee) {
    if (copyEmployee != null) {
      this.setName(copyEmployee.getName());
      this.setDepartment(copyEmployee.getRefDepartment());
    } else {
      this.setName(null);
      this.setDepartment(null);
    }
  }

  @Override
  public String toString() {
    if (this.department == null) {
      return String.format("%s не находится ни в одном из отделов", this.getName());
    }

    String depName = "без названия";
    if (this.department.getName() != null 
        && !this.department.getName().isEmpty() 
        && !Objects.equals(this.department.getName(), "unknown")) {
      depName = this.department.getName();
    }

    if (this.department.getRefBoss() == this) {
      return String.format("%s начальник отдела %s", this.getName(), depName);
    }

    String bossName = "еще не назначен";
    if (this.department.getBoss() != null) {
      if (this.department.getBoss().getName() != null 
          && !this.department.getBoss().getName().isEmpty()) {
        bossName = this.department.getBoss().getName();
      }
    }

    return String.format("%s работает в отделе %s, начальник которого %s",
        this.getName(), depName, bossName);
  }
}
