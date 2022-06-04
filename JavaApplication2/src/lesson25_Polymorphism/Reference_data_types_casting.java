package lesson25_Polymorphism;

public class Reference_data_types_casting {

    public static void main(String[] args) {
        Employee2 emp1 = new Doctor2(); // это тоже casring (автоматический upcasting)
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Driver2();
        /**
         * Например мы хотим с помощью переменной emp1 вывести на экран переменную specializaciya
         * emp1.specializaciya; - таким образом у нас не получится, потому что, даже не смотря на то, что реальный объект
         * на который ссылается emp1 Doctor, тип переменной emp1 Employee, а у Employee нет этой переменной
         * но java позволяет сделать это с помощью кастинга
         * 
         * Casting - это процесс, когды вы заставляете переменную одного типа данных вести себя как переменная 
         * другого типа данных
         * Casting возможен только тогда когда между классами/интерфейсами существуют взаимоотношения is a
         * Делая Casting вы не меняете тип объекта, а заставляете его чувствовать как объект другого типа
         * Casting из sub класса в super класс происходит автоматически - Upcasting
         * Casting из super класса в sub класс НЕ происходит автоматически - downcasting
         */
        Doctor2 d1 = (Doctor2)emp1; // downcasting
        /**
         * пример кастинга, мы говорим компилятору, поерь мне,  emp1 на самом деле ссылается на объект типа Doctor
         * мы замаркеровали переменную emp1 под переменную типа Doctor
         */

        System.out.println(d1.specialization); // Hirurg
        d1.lechit(); // лечит
        /**
         * либо мы можем сделать так:
         */
        System.out.println(((Doctor2)emp1).specialization); // Hirurg
        /**
         * обязательно ((Doctor2)emp1) нужно взять в скобки ирначе компелятор не позволит
         * 
         * можно обмануть компилятр и написать System.out.println(((Doctor2)emp2).specialization) ведь компилятор
         * не знает какой объект на самом деле emp2, но run time это проверяет и будет exception
         */
        
    }
}

class Employee2 {

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

class Teacher2 extends Employee2 {

    int numberOfStudents;

    void teach() {
        System.out.println("Учит");
    }

}

class Doctor2 extends Employee2 {

    String specialization = "Hirurg";

    void lechit() {
        System.out.println("Лечит");
    }
}

class Driver2 extends Employee2 {

    String nameOfCars;

    void drive() {
        System.out.println("едет");
    }
}
