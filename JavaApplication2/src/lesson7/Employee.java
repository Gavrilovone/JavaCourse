package lesson7;

public class Employee {

       public double salary;

    public void povyshenyeZP() {
        double result = salary*2; // у этой переменной не может быть access modifire так как она принадлежит этому методу и не является instance переменной. это локальная переменная, работает только внутри метода
        System.out.println("Новая з/п : " + result);
    }

    public Employee(double salary2) {
        salary = salary2;
    }
    
    public static void main(String[] args) {
        Employee emp =new Employee(500);
        System.out.println(emp.salary);
        emp.povyshenyeZP();
    }
}
