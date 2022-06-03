/**
 * Полиморфизм - множество форм
 * Объект в java считается полиморфным если он имеет более одной связи is a
 * Полиморфизм это способность метода вести мебя по разному, в зависимости от того какой объект вызывает его
 * Перезаписанные методы также часто называют полиморфными
 */
package lesson25_Polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();
        emp1.work();
        emp2.work();
        emp2.work();
        /**
         * это и есть полиморфизм
         */

        Employee[] array = {emp1, emp2, emp3};
            for(Employee emp: array){
                emp.work(); // вызываем метод work() для каждого объекта 
                /**
                 * emp поочередно ссылается на объекты emp1, emp2, emp3
                 * Это классический пример когда объясняют полиморфизм
                 * 
                 * output:
                 * Teacher works
                 * Doctor works
                 * Driver works
                 */
            }
    }

}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
interface Help_able {
    void help();
}

class Teacher extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Doctor extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
    @Override
    void work() {
        System.out.println("Doctor works");
    }
}

class Driver extends Employee implements Help_able {
    @Override
    public void help() {
        System.out.println("Driver helps");
    }
    @Override
    void work() {
        System.out.println("Driver works");
    }
}
