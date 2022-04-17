package lesson6;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Иванов", 25);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee(2,"Петров", 30);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(3,"Петров", 34, 200.5, "it");
        System.out.println(emp3.department);
    }
}
