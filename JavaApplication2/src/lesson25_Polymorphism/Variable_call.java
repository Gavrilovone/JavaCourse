
package lesson25_Polymorphism;


public class Variable_call {
        
    }

class Test implements interface1, interface2 {
    @Override
    public void abc(){
        System.out.println("ОК");
    }
    public static void main(String[] args) {
        Test t = new Test();
        ((interface1)t).abc(); // ОК
        t.abc(); // ОК
        /** 
         * но нам не нужно использовать casting, чтобы вызвать метод abc потому что run time компилятор определяет к какому
         * интерфейсу она относится
         * но если вызвать переменную а:
         * t.a; - будет ошибка, так как вызов переменной двусмысленный, непонятно из какого интерфеса  брать переменную,
         * но если использовать casting:
         */
        System.out.println(((interface1)t).a); // 5
        
    }
}

interface interface1{
    int a =5;
    void abc();
}
interface interface2{
    int a =10;
    void abc();
}