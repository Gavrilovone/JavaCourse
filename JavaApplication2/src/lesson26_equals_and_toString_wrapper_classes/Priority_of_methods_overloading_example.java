package lesson26_equals_and_toString_wrapper_classes;

public class Priority_of_methods_overloading_example {

}

class Test2{
   static void abc(String s){
        System.out.println("A");
    }
      static void abc(String...s){
        System.out.println("B");
    }
      static void abc(Object s){
        System.out.println("C");
    }
      static void abc(String s1, String s2){
        System.out.println("D");
    }
       
       
      static void def(Long a){
        System.out.println("E");
    }
      static void def(Long...a){
        System.out.println("F");
    }
       
       
              
       public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.abc("ok"); // A
        /**
         * Если закомментировать static void abc(String s), то следующий по приоритету вызовется метод  static void abc(Object s) потому что он
         * является parent классом класса String
         */
        
        t2.abc("ok", "!!!"); // D
        /**
         * наиболее точное совпадение  у метода static void abc(String s1, String s2), но если закомментировать его, то вызовется метод  
         * static void abc(Object s), другие не подходят по параметрам
         */
        
        t2.def(50L); // E
        
     
    }
}