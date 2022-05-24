/**
 * это изменение non-static, non-final метода в sub классе, который он унаследовал от parent класса
 * т.е это презаписанные методы в субклассе которые были унаследованы от суперкласса.
 * 
 * Методы считаются overridden если:
 * - имя в sub классе такое же как и в parent классе
 */
package lesson23_Overriding_Hiding_Final;

public class Method_overriding {
    public static void main(String[] args) {
        Employee e = new Employee();
        Teacher1 t = new Teacher1();
        e.eat();// кушает работник
        t.eat(); // кушает учитель
    }
}

class Employee {

    double salary = 100;
    String name = "Иван";
    int age;
    int experience;

    void eat() {
        System.out.println("Кушает работник");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Teacher1 extends Employee {

    int numberOfStudents;

    void teach() {
        System.out.println("Учит");
    }
    void eat() { // overridden метод
        System.out.println("Кушает учитель");
    }

}