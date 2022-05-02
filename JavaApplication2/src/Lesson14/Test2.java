/*

 */
package Lesson14;

public class Test2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // unreachable statement это выражения которые никогда не выполняются
            System.out.println(i);     // компилятор выдаст ошибку: for(int i=1; false; i++) false написать нельзя
        }   
        int j = 10 ;
        if(false){System.out.println("бла бла бла");} // if это исключение unreachable, компилятор не ругается, но
    }                                                 // тело никогда не выполнится
}
