package lesson23_Overriding_Hiding_Final;
    
public class Return_type_and_reference_varuable {

     public static void main(String[] args) {
        /**
         * Мы могли написать:
         */
        Doctor d = new Doctor(); 
        Teacher t = new Teacher(); 
        Driver dк = new Driver(); 
        Employee e = new Employee(); 
              
        /**
         * Но когда мы ссылаемся на объект, тип этой refernce переменной  и тип самого объекта на который мы ссылаемся может быть разные
         * но переменная не может ссылаться на объект любого типа, есть определенные правила.
         * переменная super класса может ссылаться на любой объект субкласса:
         */
        Employee e1 = new Doctor(); // это означает, что Doctor это Employee
        /**
         * но нелзя написать наоборот:
         * Doctor в = new Employee();
         */
        Doctor d2 = new Hirurg();// любой хирург это доктор
        Employee e2 = new Hirurg();// можно обратиться ко бъектам всех субклассов ниже по иерархии
                            
    }
       /**
        * Если return type метода Object, то возвращаемый тип может быть любой
        */
        public Object abc(){ 
            return new String("Привет"); 
        }
        public Object abc2(){ 
            return new StringBuilder("Привет"); 
        }
        public Object abc3(){ 
            return new Doctor(); 
        }
        /**
         * Потому что в конченом итоге любой объект в  java это child класс класса Object
         */
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

class Hirurg extends Doctor{
    String skalpel;
    void operacia(){
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

  