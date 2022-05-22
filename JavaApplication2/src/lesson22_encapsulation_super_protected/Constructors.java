package lesson22_encapsulation_super_protected;

public class Constructors {
   
}

 class Hummen4 {
        Hummen4(String n){
            this(n,null);
        }
        
        Hummen4(String n, String s){
            name = n;
            surmame = s;
        }
        String name;
        String surmame;
    }
class Student4 extends Hummen4{
    Student4(){
    super("Петя", "Иванов"); // если не указать, java создаст его автоматически. Но если не укажем аргументы, но будет ошибка
    }              // так как при создании объекта наследника будет вызываться родительский конструктор, а там есть параметры
    
    
    public static void main(String[] args) {
        Student4 s = new Student4();
        /**
         * когда мы создаем объект child класса, вызывается соотвтетствующий конструктор(в данном случае   Student(){};)
         * и внутри него вызывается конструктор parent класса, даже если мы ничего туда не пишем. это происходит при 
         * помощи ключевого слова super. на подобие с this, super означает обращение к предку к родителю
         */
    }
}