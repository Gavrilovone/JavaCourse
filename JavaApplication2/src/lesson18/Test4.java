/*

 */
package lesson18;

import java.util.Arrays;  // Импортируем класс Arrays которы находится в пакете java.util

public class Test4 {

    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " "); // 1 9 3 -8 0 5 4 1
        }

        System.out.println();

        Arrays.sort(array1); // сортировка от меньшего к большему
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " "); // -8 0 1 1 3 4 5 9
        }
        System.out.println();
        
        int index1 = Arrays.binarySearch(array1, 5); // ищет определенный индекс элемента в определенном масиве
            System.out.println(index1);// но метод корректно работает в отсортированном массиве. если элемента нет, будет возвращать отрицательный индекс. если массив неотсортирован, то угадать, что выдаст output предсказать невозможно
            
            System.out.println(array1);// [I@5fd0d5ae   если мы пытаемся вывести на экран любой объект, то к нему применяется метод toString()
    }

}
