package lesson11_using_primitive_and_reference_data_types_when_calling_a_method;
/*Когда мы подставляем в параметры примитивный тип данных, мы подставляем только 
  его значение
*/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Алексей", 150.55);
        double d = emp1.uvelichitel(emp1.salary);// тут в параметр передается значение переменой salary, но сама переменная не меняется
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.uvelichitelZP();
        System.out.println(emp1.salary);
        
    }
}
