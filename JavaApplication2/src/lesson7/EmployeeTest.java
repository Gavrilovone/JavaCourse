package lesson7;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.povyshenyeZP();
    }
}
