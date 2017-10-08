import java.util.*;
public class Department{
private String name;
private Set employees = new HashSet();
public Department(String newName){
name = newName;
System.out.println("DEPARTMENT");
}
public String getName(){
return name;
}
public void setName(String newName){
name = newName;
}
public void addEmployee (Employee newEmployee){
employees.add(newEmployee);
newEmployee.setDepartment(this);
}
public Set getEmployees(){
return employees;
}
public void removeEmployee(Employee e){
employees.remove(e);
}
}