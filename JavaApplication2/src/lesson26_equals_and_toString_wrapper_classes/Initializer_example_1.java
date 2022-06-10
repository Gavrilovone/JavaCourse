
package lesson26_equals_and_toString_wrapper_classes;


public class Initializer_example_1 {
    
}

class Test{
    int a = 3;
    Test(){
        a = 4;
    }
    
    {
    a = 5;
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.a); // 4
    }
}
