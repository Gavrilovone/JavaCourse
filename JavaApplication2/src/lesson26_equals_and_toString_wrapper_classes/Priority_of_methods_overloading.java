/*
 * Приоритетность методов при методах overloading 
 */
package lesson26_equals_and_toString_wrapper_classes;
/**
 * Если при вызове метода, его параметр лист соответствует нескольким параметр листам overloaded методов, то приоритет
 * их вызова выглядит следующим образом:
 * 1.Точное совпадение типов данных
 * 2.Поглащающие типы данных(большие типы данных) для примитивов и parent классы для referance типов данных
 * 3.Autoboxed типы данных
 * 4.Varargs имеет самый низкий приоритет
 */

public class Priority_of_methods_overloading {
   
}

class Test {
    void abc(int i){
        System.out.println("int");
    }
    void abc(byte i){
        System.out.println("byte");
    }
    void abc(long i){
        System.out.println("long");
    }
    
    
    
    void def(Object o){
        System.out.println("Object");
    }
    void def(String o){
        System.out.println("String");
    }
    
    
    
    void ghi(int a, int b){
        System.out.println("Hello 1");
    }
     void ghi(long a, long b){
        System.out.println("Hello 2");
    }
      void ghi(Integer a, Integer b){
        System.out.println("Hello 3");
    }
       void ghi(int...a){
        System.out.println("Hello 4");
    }
    
       
       
    public static void main(String[] args) {
        Test t = new Test();
        t.abc(5); // int
        /**
         * но если закоментировать метод  void abc(int i) то по приоритету выйдет long, так как 5 будет конвертироваться в больший тип long а не в
         * byte, если хотим, чтобы в byte, необходим casting
         */
        
        t.def("hello"); // String
        /**
         * "hello" так же является Object, но String наиболее близкое совпадение с параметром, в отсутствие String выйдет Object
         */
        
        t.ghi(1, 2);// Hello 1
        /**
         * не смотр на то, что все методы подходят, наибольшее совпадение у этого метода ghi(int a, int b)
         */
    }
}
