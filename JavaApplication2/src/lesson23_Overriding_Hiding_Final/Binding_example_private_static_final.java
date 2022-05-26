
package lesson23_Overriding_Hiding_Final;


public class Binding_example_private_static_final {
    public static void main(String[] args) {
        Employee3 emp = new Employee3();
        Teacher3 t3 = new Teacher3();
        /**
         * emp.sleep(); ошибка, мы не видим этот метод потому что он private
         */
        Employee3 e3 = new Teacher3();
        /**
         * t3.sleep(); так же ошибка, мы не видим этот метод потому что он private, но если изменить его на менее строгий например public
         * то в output  выйдет: Спит учитель
         */
        
    }
}
class Eda3 {
    }

    class Frukty3 extends Eda3 {
    }

    class Employee3 {
        String name = "Николай";

        Eda3 eat() {
            System.out.println("Кушает работник");
            Eda3 e = new Eda3();
            return e;
        }
        
        private void sleep(){
            System.out.println("Спит работник");
        }

    }

    class Teacher3 extends Employee3 {

        int numberOfStudents;

        Frukty3 eat() { 
            System.out.println("Кушает учитель");
            Frukty3 f = new Frukty3();
            return f;
        }
        
        private void sleep(){
            System.out.println("Спит учитель");
            /**
             *компилятор не ругается, вроде бы overriding прошел, но нет, на самом деле так как метод sleep в super классе private, то
             * мы его не видим и соответственно он не наследуется и здесь на самом деле мы просто создали новый метод sleep
             * 
             * поэтому compile time относится к private, static, final методам, так как они не оверайдются и run time binding не нужен
             */
        }

    }
