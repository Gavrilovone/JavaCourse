
package lesson6;


public class MethodOverLoading {
    void show(int i1){
        System.out.println(i1);
    }
    
    void show(boolean b1){
        System.out.println(b1);
    }
    
     void show(String s1){
        System.out.println(s1);
     }
        
       void show(String s2, int i2){
        System.out.println("Печать именно этого метода");
     }
}

