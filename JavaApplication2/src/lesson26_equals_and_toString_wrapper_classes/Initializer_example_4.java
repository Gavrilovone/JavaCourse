package lesson26_equals_and_toString_wrapper_classes;

public class Initializer_example_4 {

}

class D {

    static {
        abc(2);
    }

    static void abc(int a) {
        System.out.println(a + " ");
    }

    D() {
        abc(5);
    }

    static {
        abc(4);
    }

    {
        abc(6);
    }

    static {
        new D(); 
        /**
         * внутри статического инциализатора происходит создание объекта D, и при его создании, сначала выполняются 
         * все non-static инициализаторы и в последнюю очередь конструктор
         */
    }
    
    {
        abc(8);
    }
    
    public static void main(String[] args) {
        /**  
         * в методе main ниего не происходит
         */
    }
    
    /**
     * output:
     *        2 
              4 
              6 
              8 
              5 
     */
}
