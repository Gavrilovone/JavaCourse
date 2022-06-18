package lesson22_encapsulation_super_protected;

/**
 * protected access modifier работает так же как дефолтный
 * Subclass-ы наследуют элементы protected класса родителя даже если subclass находится в другом пакете
 * 
 * пр попытке обратиться к переменой родител через класс родителя который находится в дугом пакете(где находится его потомок)
 * будет ошибка компиляции. потому что он находится в другом пакете
 *
 */

public class Protected_access_modifier {

}

class Hummen2 {
   
    protected String name = "Николай";
    protected static int salary = 150;

    protected void work() {
        System.out.println("Работать");
    }

    protected static void rest() {
        System.out.println("Отдыхать");

    }

}

class Student extends Hummen2 {

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary); 
        s.work();
        Student.rest();
    }
}
  