
package lesson22_encapsulation_super_protected;

public class Constructor_example {
    
}


 class Hummen3 {
        Hummen3(String n){
            this(n,null);
        }
        
        Hummen3(String n, String s){
            name = n;
            surmame = s;
        }
        String name;
        String surmame;
    }

class Student3 extends Hummen3{
    Student3(){
    this(5); 
        System.out.println("Hello");
    }          
    
    Student3(int i){
        super("Петя");
        
    }
    public static void main(String[] args) {
        Student3 s = new Student3();
        
    }
}
