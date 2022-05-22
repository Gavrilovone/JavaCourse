/**
 * Inheritance(наследование)
 * Java не поддерживает множественное наследование. Тоесть У класса родителя может быть много наследников, но
 * наследник не может иметь больше одного родителя.
 * синтаксис такой:
 *
 * class Parent{some code}
 * class Child extends Parent{some code}
 *
 * extend переводится как расширять
 *
 * класс Child может называться Derived(полученный) class, Child class, Subclass, extendeв class. все это одно и тоже
 * класс Parent может называться Parent class, Super class, Base class
 * 
 * Наследование нужно для:
 * - более короткого написания классов
 * - легкость добавления/изменения элементов
 * - Extensibility(расширяемость). Где уместно использовать super class там усестно использовать subclass
 * - более легкое тестирование классов
 * - группировка классов под общим типом(Доктор это работник, тичер это работник, драйвер это работник)
 * 
 * Отношение(relationship) между классами:
 * - отношение между классами "is-a" т.е. Доктор это работник, Дантист это доктор
 * - отношенеи между классами "Has-a"т.е.  Нпример Дом имеет окно. здесь нет наследственности. Просто внутри класса
 * Дом используется объект класса окно.
 * 
 * Конструкторы не наследуются!
 * 
 */
package lesson22_encapsulation_super_protected;

public class Inheritance {
    public static void main(String[] args) {
        Doctor doc  = new Doctor(); 
/*Доктор наследовал от Employee все его атрибуты и может к ним обращаться как будто-бы они у него в теле */ 
        doc.age = 40;
        doc.experience = 20;
        doc.specialization = "Хирург";
        doc.eat();
        doc.sleep();
        doc.treat();
    }
}

/*
class Doctor {

    String name;
    int age;
    int experience; // опыт, лет
    String specialization;

    void eat() {
        System.out.println("Кушает");
    }

    void sleep() {
        System.out.println("Спит");
    }

    void treat() {
        System.out.println("Лечит");
    }

}

class Teacher {

    String name;
    int age;
    int experience;
    int numberOfStudents; // количество учеников

    void eat() {
        System.out.println("Кушает");
    }

    void sleep() {
        System.out.println("Спит");
    }

    void teach() {
        System.out.println("Учит");
    }

}

class Driver {

    String name;
    int age;
    int experience;
    int machineName; // название машины

    void eat() {
        System.out.println("Кушает");
    }

    void sleep() {
        System.out.println("Спит");
    }

    void drive() {
        System.out.println("Водит");
    }

}

 */
/**
 * Так выглядит обычное написание этих классов. так громоздко и неудобно. у них много общих атрибутов и эти классы можно объеденить в один общий класс например Employee:
 */



class Employee {

    String name;
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
/** 
 * Subclass-ы так же могут расширяться, и в итого образуется иерархия. Дантист так же является работником.
 * У этой иерархии есть коец. это класс Object. все классы в конечном итоге это прямые или косвенные потомки 
 * класса Object. 
 *  class Employee extends java.lаng.Object - если мы это не пишемкомпилятор атвоматически добавляет при компиляции
 */ 
class Dantist extends Doctor{

}
