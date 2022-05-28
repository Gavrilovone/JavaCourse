package lesson23_Overriding_Hiding_Final;

public class Example_hide {

    public static void main(String[] args) {
        Mouse2 a = new Mouse2();

        a.showInfoAboutAnimal();// Name of animal: Some animal
        a.showInfoAboutMouse(); // Name of mouse: Jerry

    }

}

class Animals2 {

    static String showName() {
        return "Some animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse2 extends Animals2 {

    static String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }
}
/**
 * Методы showName не оверайдятся, а хайдятся. Метод shoName статичны и определяются compile time
 * Если мы уберем static, то метод showName уже будет переаписан в child классе и при вызове  a.showInfoAboutAnimal() 
 * метод showName будет уже вызываться run time(а так как java видит, что это объект типа Mouse, значит будет вызываться
 * метод showName изи класса Mouse) и кв output уже будет Name of animal: Jerry
 *  
 */

