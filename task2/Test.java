public class Test{
public static void main(String[] args){
Route route = new Route("Russia", "Amsterdam", 500, 2);
Plane plane = new Plane(112, 60, route);
Department flyingDepartment = new Department("������");
Employee chiefNavigator = new Employee("�������", "������", "������� �������");
chiefNavigator.setPlane(plane);
flyingDepartment.addEmployee(chiefNavigator);
}
}