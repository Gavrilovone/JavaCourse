/*
 
 */
package Lesson14;

public class Test5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // если i будет равен 7, тогда цикл останавливается. на экран выйдет от 1 до 6
            }
            System.out.println(i);
        }
        
        System.out.println();
        
        for (int i = 1; i <= 100; i++) {
            if (i == 87) {
                continue; // компилятор пропустит итерацию если i=87 и перейдет к следующему итерейшину
            }
            System.out.println(i);
        }
        
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue; // компилятор пропустит итерацию если i=10 и перейдет к следующему итерейшину
            }
            if (i % 55 == 0) { // деление на остаток нацело, т.е. при  55/55= остаток 0, остановить цикл
                break;
            }
            System.out.println(i);
        }
        
    }
}

