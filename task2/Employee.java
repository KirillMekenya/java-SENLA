public class Employee extends Man {
private String position;
private Department department;
private Plane plane;
public Employee(String newName, String newSurname, String newPosition){
this.name = newName;
this.surname = newSurname;
this.position = newPosition;
System.out.println("EMPLOYEE");
}
public Plane getPlane(){
return plane;
}
public void setPlane(Plane plane){
this.plane = plane;
}
public Department getDepartment(){
return department;
}
public void setDepartment(Department department){
this.department = department;
}
public String getPosition(){
return position;
}
public void setPosition(String newPosition){
position = newPosition;
}
}
