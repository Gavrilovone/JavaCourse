package lesson26_equals_and_toString_wrapper_classes;

public class Initializer_example_2 {

}

class Test {

    int a = 3;

    Test() {
        a = 4;
    }

    {
        a = 5;
    }

}

class A {

    static final int b;
    /**
     * мы не можем не инициализировать статическую переменную здесь, и не можем инициалищировать ее  в конструкторе, будет ошибка, потому, что мы можем
     * воспользоваться ей до создания объекта, на то она и static, но:
     */

    static {
        b = 10;
        /**
         * статическую перременную можно инициализировать внутри static initializer  блока, потому, что статический блок срабатывает при загрузке класса
         */
    }
}

class B{
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;
    
    static{
        c = 5;
        d = 3;
     // e = 2; - константа же была инициализирована, будет ошибка
        f = 3;
    }
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
    static{
        i =  i + 1;
        System.out.println(i);
    }
    C(){
        System.out.println("This is constructor");
    }
    
    public static void main(String[] args) {
        C с = new C();
    }
    /**
     * output:
              0
              1
              Ok
              This is constructor
     */
}
