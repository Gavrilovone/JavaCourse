package lesson25_Polymorphism;

public class Example {

}

class Test1 {

    int a = 5;

    void abc() {
        System.out.println("ok1");
    }
}

class Test2 extends Test1 {
    
    int a = 10; // hide

    @Override
    void abc() {
        System.out.println("ok2");
    }
}

class Test3 extends Test2 {
    
    int a = 15;

    @Override
    void abc() {
        System.out.println("ok3");
        /**
         * Если мы захотим вызвать метод abc(); из класса Test, то напишем так:
         */
        super.abc();
        /**
         * Но если мы захотим вызвать метод abc() из класса Test1 то написать так:
         * super.super.abc(); уже нельзя
         */
        
    }
    public static void main(String[] args) {
        Test3 t = new Test3();
        System.out.println(((Test1)t).a); // 5
        /**
         * Мы говорим компилятору: воспринимай переменную t как переменную типа Test1, а из-за того , что переменные
         * имеют compile time binding, dj время компиляции уже известно, что переменная "a" относится к классу test1 и 
         * поэтому на экран будет выводится 5
         */
        ((Test1)t).abc();
    }
}

