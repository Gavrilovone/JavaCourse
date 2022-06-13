
package lesson27_Exсeptions;

import java.io.*;
;

public class Example_exception_1 {
    
}

class Test5{
    
      void abc() { 
         int []array = {1, 2};
          System.out.println(array[5]);
      }
     
      void def() throws ArrayIndexOutOfBoundsException{
          abc();
          
      }
      
      public static void main(String[] args) {
        Test5 t = new Test5();
        
        try{
            t.def();  
          }
          
          catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Было поймано исключение: " + e);
              System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2( тип исключения и его message)
              /** 
               * у этого объекта "е" есть метод getMessage
               */
              System.out.println(e.getMessage());// Index 5 out of bounds for length 2
              /**
               * можно вывести на экран StackTrace, у любого объекта есть метод stackTrace
               */
              e.printStackTrace(); 
              /**
               *    output:
                    at lesson27_Exсeptions.Test5.abc(Example.java:15)
	            at lesson27_Exсeptions.Test5.def(Example.java:19)
	            at lesson27_Exсeptions.Test5.main(Example.java:27)
               */
          }
    }
}