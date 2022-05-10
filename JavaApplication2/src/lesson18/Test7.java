
package lesson18;


public class Test7 {
    public static void main(String[] args) {
        // еще один конструктор класса String
        char[] array ={'p','r','i','v','e','t'};
        String s = new String(array);
        System.out.println(s);
        
        StringBuilder sb = new StringBuilder("Hello World");
        sb.append(array,2,3); // второй параметр говорит с какого индекса мы добавим , третий параметр сколько
        System.out.println(sb);// Hello Worldive
        
         StringBuilder sb2 = new StringBuilder("Hello World");
         sb2.insert(2, array,1,3); // первый параметр - будем инсертить на вторй позиции, второй параметр что? третий параметр с какой позиции массива, четвертый параметр сколько
         System.out.println(sb2);
    }
}
