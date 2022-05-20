/*

 */
package lesson15_while_do_while;

public class while_example2 {

    public static void main(String[] args) {

        boolean b = true;
        int a = 1;

        // Выводить на экран все числа с интервалом 1, пока не дойдем до числа которое нацело делится и на 3 и на 7 . в output выйдут числа от 1 до 21
        while (b) {
            System.out.println(a);

            if (a % 3 == 0 && a % 7 == 0) {
                b = false; // можно использовать в loop a++;
            }
            a++;

        }

    }

}
