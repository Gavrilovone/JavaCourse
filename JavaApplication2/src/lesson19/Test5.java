/*
 * nested foreach loop
 */
package lesson19;

public class Test5 {

    public static void main(String[] args) {
        String[] students = {"Иванов", "Петров", "Сидоров"};
        String[] examp = {"Мат анализ", "Философия"};
        for (String s1 : students) {
            for (String s2 : examp) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
