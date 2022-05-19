package lesson20__ArrayList;

import java.util.Arrays;

public class Array__mismatch {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        char[] array3 = {'п', 'р', 'и', 'в', 'е', 'т'};
        char[] array6 = {'п', 'р', 'и', 'в', 'е', 'т', 'o'};
        char[] array4 = {'п', 'р', 'и', 'в', 'и', 'в', 'к', 'а'};
        char[] array7 = null;
        char[] array8 = null;

        // метод mismatch находит индекс первого расхождения массива или -1 если они одинаковые
        System.out.println(Arrays.mismatch(array1, array2));//  3
        System.out.println(Arrays.mismatch(array2, array5));// -1
    }
}
