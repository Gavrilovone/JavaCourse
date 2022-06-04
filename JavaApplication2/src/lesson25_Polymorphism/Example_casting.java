package lesson25_Polymorphism;

public class Example_casting {

    public static void main(String[] args) {
        Employee3 emp1 = new Doctor3(); 
        Employee3 emp2 = new Teacher3();
        Employee3 emp3 = new Driver3();
        Employee3 emp4 = new Employee3();
        Employee3[] array = {emp1, emp2, emp3, emp4};

        for (Employee3 e : array) {
            /**
             * мы хотин например работать только с теми элементами массива, которые относятся к классу Doctor и если
             * мы находим такой элемент, то выводилось название его машины и вызывался метод
             * drive();
             */
            if (e instanceof Driver3) {
                System.out.println(((Driver3) e).nameOfCars); // BMW
                ((Driver3) e).drive(); // едет

            }

        }

    }
}

class Employee3 {

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

class Teacher3 extends Employee3 {

    int numberOfStudents;

    void teach() {
        System.out.println("Учит");
    }

}

class Doctor3 extends Employee3 {

    String specialization = "Hirurg";

    void lechit() {
        System.out.println("Лечит");
    }
}

class Driver3 extends Employee3 {

    String nameOfCars = "BMW";

    void drive() {
        System.out.println("едет");
    }
}
