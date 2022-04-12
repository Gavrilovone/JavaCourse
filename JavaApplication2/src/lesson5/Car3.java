
package lesson5;


public class Car3 {
    
    Car3(String cvet, String motor, int skorost){
    
       color = cvet;
       ingine = motor;
       speed = skorost;
    
    }
    
    String color;
    String ingine;
    int speed;
    
    
    public static void main(String[] args) {
        
        
        Car3 machin = new Car3("Зеленый", "V6", 60);
            System.out.println(machin.color);
           
        
    }
}
