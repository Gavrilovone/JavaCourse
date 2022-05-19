package lesson19__varargs_foreach;

public class Test6 {

    public static void main(String[] args) {
        int[][] array = {{3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " "); // 3 7 8 4 5 9 4 4 6 8 3
            }
        }
        System.out.println("");

        for (int[] array2 : array) {  // элементом двумерного массива array является одномерный массив array2
            for (int a : array2) {
                System.out.print(a + " "); // 3 7 8 4 5 9 4 4 6 8 3
            }

        }
    }
}
