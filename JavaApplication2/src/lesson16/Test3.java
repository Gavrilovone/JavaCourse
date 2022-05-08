
package lesson16;


public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "Ok";
        System.out.println(a+b+s);// 11Ok сначала складываются числа, а потом конкатенация
        System.out.println(s+a+b);// Ok56 так как первый элемент String, то сначала конкатенация
        String s1 = null;
        
        s1+="Ok";
        System.out.println(s1); // nullOk
    }
}
