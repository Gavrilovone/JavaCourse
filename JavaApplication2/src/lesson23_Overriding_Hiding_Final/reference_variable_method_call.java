package lesson23_Overriding_Hiding_Final;

public class Reference_variable_method_call {

    public static void main(String[] args) {

        /**
         * Какие переменные мы можем вызывать и какие методы, с помощью reference variable:
         */
        Employee e1 = new Doctor();
        System.out.println(e1.salary);
        System.out.println(e1.name);
        System.out.println(e1.age);
        System.out.println(e1.experience);
        e1.eat();
        e1.sleep();
        /**
         * e1.treat(); компилятор выдаст ошибку.
         * хотя реальный объект на который ссылается переменная e1 это Doctor. потому, что 
         * он всегда смотрит на тип переменной, а у Employee нет метода treat, он есть у его child класса но не у него. а классу 
         * Doctor присущи все переменные и методы Employee
         */
                 
        Doctor d2 = new Hirurg();
        System.out.println(d2.salary);
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.experience);
        d2.eat();
        d2.sleep();
        d2.treat(); // 
        Employee e2 = new Hirurg();
        /**
         * т.е. если переменная типа данных супер класса ссылается на объект субклаасса, то спомощью этой переменной можно вызвать только
         * унаследованные от супер класса элементы.
         */

    }

    public Object abc() {
        return new String("Привет");
    }

    public Object abc2() {
        return new StringBuilder("Привет");
    }

    public Object abc3() {
        return new Doctor();
    }

}

class Employee {

    double salary = 100;
    String name = "Иван";
    int age;
    int experience;

    void eat() {
        System.out.println("Кушает");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Doctor extends Employee {

    String specialization;

    void treat() {
        System.out.println("Лечит");
    }
}

class Hirurg extends Doctor {

    String skalpel;

    void operacia() {
        System.out.println("Оперирует");
    }
}

class Teacher extends Employee {

    int numberOfStudents;

    void teach() {
        System.out.println("Учит");
    }

}

class Driver extends Employee {

    int machineName;

    void drive() {
        System.out.println("Водит");
    }
 }
