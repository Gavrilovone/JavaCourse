/*
 
 */
package lesson18__Array;

public class Array_declaration_Initialization {

    public static void main(String[] args) {
        // 1 этап - declaration array:
        // означает, что создается массив, который ссылается на Null
        int[] array1; // объявлил массив типа данных int с именем array1 
        String[] array2;
        double[][] array3; // двумерный массив типа данных double
        int[][] array4;
        // 2 этап allocation(распределение) на этом этапе указывается размер:

        array1 = new int[8]; // длина массива 8
        array2 = new String[3];
        array3 = new double[4][2]; // 4 одномерных массива, длины которых равны 2
        array4 = new int[3][]; // пустыми можно оставлять только вторые скобки и только в том случае, если 
        //   если длины одномерных массивов одинаковые.

        System.out.println(array2.length);// у массива length это элемент(атрибут класса), поэтомк без скобок, а у String это метод.

        // 3 этап это initialization:
        // статическая инициализация:
        array2[0] = "Привет";
        array2[1] = "Привет";
        array2[2] = "Привет";

        array3[0][0] = 3.14;

        double[] array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array3[1] = array5; // можно записать так, так как array5 состоит из 2х элементов, так же как и одномерные массивы array3
        System.out.println(array3[1][0]);// 2.5

        // смешанное создание массива:
        int[] array6 = new int[2];// тут массив не инициализирован и ячееки принимают дефолтныезначения(для int это 0)
        int[] array7 = {1, 2, 3};
        int[] array8;
        array8 = new int[]{1, 2, 3};

//        int[] array8;
//        array8 ={1,2,3};   так нельзя! ели мы разбиваем на 2 строчки, нужно уже через new
        int [] array9 = new int[]{1, 2, 3}; // длинно , но тоже можно
        // int [] array9 = new int[3]{1, 2, 3}; а вот так уже писать нельзя, нельзя тут указывать длину массива повторно явно или неявно
        
        int [] array10, a; // говорит о том, что и array10  и с это массивы
        int array11[],b ; // тут array11 это массив, а b это переменная типа int. но так лучше не стоит писать
        int [] array12, array13[][]; // array12 это одномерный массив, а array13 это 3х мерный массив
        // int array12[], array13[][]; // array12 это одномерный массив, а array13 это 2х мерный массив
        
    }
}
