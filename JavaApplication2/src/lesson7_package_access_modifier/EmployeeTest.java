package lesson7_package_access_modifier;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.povyshenyeZP();
    }
}
