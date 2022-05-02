/*
    - Цикл for используется, когда заранее известно сколько раз нужно повторить одно и то же действие 
      если в теле for один statement, то фигурные скобки ставить необязательно, но лучше ставить
    - в condition тип boolean (int i; i<=0 && i>7 || i <=10)
    - если отсутствует condition statement (i = 1; ; i++) так же цикл будет бесконечный, потому что условие цикла всегда true
 */
package Lesson14;

public class Test1 {

    public static void main(String[] args) {
        //int i =1; инициализация может быть либо вне цикла for либо внутри него
        // for(int i = 1, j = 2) можно инициализировать так, но, чтобы тип был одинаковый
        for (int i = 1; i <= 14; i++) {
            System.out.println(i + ". Добро пожаловать на урок 14");
            // i++; может быть в теле,без разницы
        }
        for (int i = 5; i <= 11; i++, abc(10)) {  // в update statement можно даже вызвать метод
            System.out.println(i);
        }

    }

    static void abc(int a) {

        for (int i = a; i <= 11; i++) {
            System.out.println(a);  
            a++;
        }
    }
}
