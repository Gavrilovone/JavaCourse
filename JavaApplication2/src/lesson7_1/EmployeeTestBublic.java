package lesson7_1;

public class EmployeeTestBublic {

    public static void main(String[] args) {
        lesson7_package_access_modifier.Employee emp = new lesson7_package_access_modifier.Employee(500);
        System.out.println(emp.salary);
        emp.povyshenyeZP();
    }

}
