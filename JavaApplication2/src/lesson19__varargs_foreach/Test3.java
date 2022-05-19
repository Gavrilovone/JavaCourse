/*
 * Enhanced(повышенный) for = foreach
  В основном используется с массивами и с коллекциями
 */
package lesson19__varargs_foreach;

public class Test3 {

    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // 0 6 4 1
        }
        System.out.println("");

        // как это можно выполнить с помощью foreach
        for (int a : array) { // в зависимости от типа данных array создаем переменную такого же типа
            System.out.print(a + " "); // 0 6 4 1
        }
    }

}
