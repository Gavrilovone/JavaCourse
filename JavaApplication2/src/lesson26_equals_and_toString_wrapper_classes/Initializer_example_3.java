
package lesson26_equals_and_toString_wrapper_classes;


public class Initializer_example_3 {
    
}

class C{
    String s = "Ok";
    {
        System.out.println(s);
    }
    
    static int i = 0;
    
    static{
        System.out.println(i);
    }
    {
        i =  i + 1;
        System.out.println(i);
    }
    C(){
        System.out.println("This is constructor");
    }
    
    public static void main(String[] args) {
        System.out.println("Hi everyone");
        C с = new C();
        
        /**
         *  output:
         *          0
                    Hi everyone
                    Ok
                    1 
                    This is constructor
         */
    }
  
}