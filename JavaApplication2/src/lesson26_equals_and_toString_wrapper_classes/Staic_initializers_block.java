package lesson26_equals_and_toString_wrapper_classes;
/**
 * в static initializer нельзя обращаться к нестатичской переменной потому что такая переменная еще не сущестует во ремя загрузки класса,
 * она определяется во время создания объекта класса
 */

public class Staic_initializers_block {

}

class Test {
    {
        System.out.println("This is inin block 3");
    }

    Test() {
        System.out.println("This is Konstructor 1");
    }

    Test(int a) {
        this(); // вызов своего overloaded конструктора
        System.out.println("This is Konstructor 2");
    }

    {
        System.out.println("This is inin block 1");
    }
    
    static {
        System.out.println("This is STATIC init block 1");
    }

    {
        System.out.println("This is inin block 2");
    }
    static {
        System.out.println("This is STATIC init block 2");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println("");
        Test t2 = new Test(3);
        
        /**
         * output:
         * This is STATIC init block 1
           This is STATIC init block 2   - сработали 1 раз самые первые
           This is inin block 3
           This is inin block 1
           This is inin block 2
           This is Konstructor 1
           
           This is inin block 3
           This is inin block 1
           This is inin block 2
           This is Konstructor 1
           This is Konstructor 2
         */

    }

}
