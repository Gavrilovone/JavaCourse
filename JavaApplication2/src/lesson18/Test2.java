package lesson18;

public class Test2 {

    public static void main(String[] args) {
        // Динамическая инициализация массива

        String[] array1;
        double[][] array2;

        array1 = new String[3];
        array2 = new double[3][]; // 3 одномерных массива, длины которых разные

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "Привет " + i;
            System.out.println(array1[i]);
        }

        // перед тем как динамически инициализировать array2 мы должны задать длину которую имеют одномерные массивы в двумерном массиве
        array2[0] = new double[5];
        array2[1] = new double[2];
        array2[2] = new double[7];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = i + j;
                System.out.println(array2[i][j]);
            }

        }
        int[][][] array3 = new int[2][2][2];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                for (int m = 0; m < array3[i][j].length; m++) {
                    array3[i][j][m] = i + j + m;
                    System.out.println(array3[i][j][m]);

                }

            }

        }

    }
}
