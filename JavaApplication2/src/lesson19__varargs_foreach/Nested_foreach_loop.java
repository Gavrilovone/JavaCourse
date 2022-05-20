/*
 * nested foreach loop
 */
package lesson19__varargs_foreach;

public class Nested_foreach_loop {

    public static void main(String[] args) {
        String[] students = {"Иванов", "Петров", "Сидоров"};
        String[] examp = {"Мат анализ", "Философия"};
        for (String s1 : students) {
            for (String s2 : examp) {
                System.out.println(s1 + " " + s2);
                /*
                                                    Иванов Мат анализ
                                                    Иванов Философия
                                                    Петров Мат анализ
                                                    Петров Философия
                                                    Сидоров Мат анализ
                                                    Сидоров Философия
                 */

            }
        }
    }
}
