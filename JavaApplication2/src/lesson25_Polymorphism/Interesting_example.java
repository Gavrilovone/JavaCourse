
package lesson25_Polymorphism;

public class Interesting_example {
   
}

class Car{
static int  a =5;
public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);// 5
        c = null;
        System.out.println(c.a);// 5
    }
/**
 * Если бы переменная a была бы non-statiс, то была бы ошибка, но из-за того, что она static, то реальный
 * объект не проверяется компилятором.Просто проверяется к какому классу относится переменная с и выводится 
 * на экран статическая переменная а относящаяся к классу Car.Поэтому тут нет разницы с ссылается на какой то 
 * объект или нет с=null
 */
}
