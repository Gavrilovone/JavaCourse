/**
 * keyword super означает обращение к элементу родительского класса
 * с его помощью можно обращаться как к переменным так и методам родительского класса
 */
package lesson23_Overriding_Hiding_Final;

public class Keyword_super {
    public static void main(String[] args) {
        B10 b  = new B10();
        System.out.println(b.s2); // Привет, Друг!
    }
    
}

class A10{
String s1 = "Привет";
    static double d1 = 3.14;

    int summa(int... i) {
        int result = 0;
        for (int a : i) {
            result += a;
        }
        return result;
    }

        static void abc(String[] args) {
        System.out.println("Static method");
    }
}

class B10 extends A10{
String s2 = super.s1 + ", Друг!";
double d1 = super.d1; // так можно написать потому что с помощью объекта можно обратиться к static переменной
/**
 * переменной s2 присвоили значение s1 + конкатенация
 * super (String s2 = s1 + ", Друг!";) можно было бы не писать, результат будет одинаковый
 * обычно super мы пишем тогда, когда  мы эту переменную из супер класса (в данном случае s1) делаем hide то в sub классе к ней можно 
 * обратиться только спомощью ключевого слово super
 * допустим String s1 = super.s1 + ", Друг!"; хотим чтобы переменная s1 в классе B10 была такая же как переменная из класса A + Друг
 * тогда без ключевого слова super уже нельзя
 * 
 * как и с this, super нельзя употреблять в статик методах
 */

/**
 * допустим мы хотим перзаписать метод summa, добавить вывод на экран суммы, мы можем написать:
 */
    int summa(int...i){
        int result = super.summa(i);
        System.out.println(result);
        return result;
    } 
}