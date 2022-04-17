
package lesson6;
/**
 * 1. у методов OverLoading может быть одинаковый return type: void method(int a, int b{}
 *                и может быть разный                        int method(String s) {return s}
 * 2. Access modifier  может быть одинаковый или различный: public void method(int a, int b{}
 *                                                          private void method(int a, int b, int c){}
 * Методы отличающиеся только return type или access modifier не являются OverLoaded(Compile error):
 *                                                        public void method(int a, int b){}
 *                                                       private void method(int a, int b){}
 */                                                         
public class MethodOverLoading2Test {
    public static void main(String[] args) {
        MethodOverLoading2 mO2 = new MethodOverLoading2();
        
        int a = mO2.sum(5, 7);
        String s = mO2.sum("Привет как дела ", "отличная погода");
        System.out.println(a);
        System.out.println(s);
    }
}
