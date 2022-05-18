package lesson20;

import java.util.*;

public class Array_compare {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        char[] array3 = {'п', 'р', 'и', 'в', 'е', 'т'};
        char[] array6 = {'п', 'р', 'и', 'в', 'е', 'т', 'o'};
        char[] array4 = {'п', 'р', 'и', 'в', 'и', 'в', 'к', 'а'};
        char[] array7 = null;
        char[] array8 = null;
        

        // у метода compare очень моного overloaded методов в данном случае он принимает два массива одинакового типа
        System.out.println(Arrays.compare(array1, array2));// -1  если  первый массив меньще второго cjmpare возвращает значение меньше нуля
        System.out.println(Arrays.compare(array2, array1)); // 1 если первый массв больше второго compare возвращает значене больше нуля
        System.out.println(Arrays.compare(array3, array4)); // -3 
        System.out.println(Arrays.compare(array3, array6)); // -1 
        System.out.println(Arrays.compare(array3, array7)); // 1  reference null всегда меньше
        System.out.println(Arrays.compare(array7, array8)); // 0
         // если мы попытаемся сравнить  два элемента разных типов например array1 и array3  компилятор выдаст ошибку
        
    }
}
