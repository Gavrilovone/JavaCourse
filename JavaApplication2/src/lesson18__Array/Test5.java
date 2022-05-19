package lesson18__Array;

public class Test5 {

    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1};
        int[] array2 = {1, 9, 3, -8, 0, 5, 4, 1};
        System.out.println(array1 == array2);// false
        System.out.println(array1.equals(array2));// false   следовательно метод equals в массивах не перезаписан и работает для массива как ==
        int[] array3 = array2;
        System.out.println(array3 == array2); // true так как  array2 и array3 ссылаются на один объект

        array1[1] = 0;
        array2[5 - 3] = 3; // можно так
        array1[array1.length] = 10; // будет Exceptions так как максимальный индекс этого массива это 7
    }

}
