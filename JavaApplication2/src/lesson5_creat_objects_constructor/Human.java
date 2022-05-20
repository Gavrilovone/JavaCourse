
package lesson5_creat_objects_constructor;


public class Human {
    
    String name;
    Car4 car;
    BankAccount bA;
    
    void info(){
        System.out.println("Личная карточка клиента");
        System.out.println("Имя: " + name);
        System.out.println("Цвет машины: " + car.color);
        System.out.println("Баланс: " + bA.balance +" $");
    } 
        
    }
        
        
 class HumanTest{
     public static void main(String[] args) {
         
         Human h =new Human();
         h.name = "Алексей";
         h.car= new Car4("Красный","V8",60);
         h.bA=new BankAccount(18,200);
         h.info();
         
         
     }
 
 }
        

class Car3{
    
String color;
String ingine; 
    
Car3(String c, String e){
    color=c;
    ingine=e;
}

}

class BankAccount{
int id;
double balance;

BankAccount(int id2, double balance2){
id=id2;
balance=balance2;

}

}





        



    



