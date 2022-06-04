
package lesson25_Polymorphism;

/**
 * оператор instanceof:
 * instanceof переводится(объект ли?)
 * Car с = new Car();
 * System.out.println(с instanceof Object); с является объектом типа Object? да по-этому output будет true 
 * 
 * instanceof проверяет есть ли между обектом и классом/интерфейсом связь is a.Если этой связь невозможна,то
 * компилятор выдаст ошибку
 */
public class Instanceof {
 public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Doctor();
        Employee emp3 = new Driver();
     
     System.out.println(emp1 instanceof Employee); // true
     System.out.println(emp1 instanceof Teacher); // true
     System.out.println(emp1 instanceof Driver); // false
     System.out.println(emp1 instanceof Help_able); // true
     /**
      * System.out.println(emp1 instanceof Instanceof ); - ошибка потому что emp1 и класс Instanceof ни как не могут
      * быть связаны между собой
      */
     String s1 = null;
     System.out.println(s1 instanceof String); // false - потому что null это ничто, а не String
   
     
     
      
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
