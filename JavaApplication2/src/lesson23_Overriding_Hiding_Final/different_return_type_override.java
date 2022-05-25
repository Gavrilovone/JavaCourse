package lesson23_Overriding_Hiding_Final;

public class different_return_type_override {
    public static void main(String[] args) {
        
    }
    
    class Eda {
    }

    class Frukty extends Eda {
    }

    class Employee {

        Eda eat() {
            System.out.println("Кушает работник");
            Eda e = new Eda();
            return e;
        }

    }

    class Teacher1 extends Employee {

        int numberOfStudents;

        Frukty eat() { // covariant return type  см. Method_overriding
            System.out.println("Кушает учитель");
            Frukty f = new Frukty();
            return f;
        }

    }

}
