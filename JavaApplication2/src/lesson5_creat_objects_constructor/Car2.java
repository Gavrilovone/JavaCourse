
package lesson5_creat_objects_constructor;


public class Car2 {
    // Car() { } дефолтный конструктор, который создается компилятором при создании объекта если мы его тут не пишем явно

    String color;
    String ingine;
    int speed;
    
    int gaz (int skorost){
        speed += skorost;
        return speed;
     }
    
     int tormoz (int tormoz){
        speed -= tormoz;
        return speed; // output
     }

     void showInfo(){ // void пишем когда нам не надо ничего возвращать, тоесть output пустой
         System.out.println("Цвет: "+ color + " Мотор: " + ingine + " Скорость: "+ speed + " km/h"); // вывод нане является output
     }
}

     class Car2Test{
         public static void main(String[] args) {
             Car2 c1 =new Car2(); 
             c1.color = "White";
             c1.ingine = "V6";
             c1.speed = 60;
             
             c1.showInfo();
             c1.gaz(20);
             c1.showInfo();
             c1.tormoz(40);
              c1.showInfo();
         }
     }




