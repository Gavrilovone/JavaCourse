
package lesson8_final_static;

public class Car {
    String color = "blue";
    String ingine = "V6";
}

class Human{
    String name = "Ivan";
    Car c = new Car();
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.color = "red";
        System.out.println(h1.c.color);
        
    }
}
    
