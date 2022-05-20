
package lesson18__Array;

//  Introduction in Exceptions (Введение в исключения)
public class Array_exceptions {
    public static void main(String[] args) {
      //  int[] array = new int[-3]; будет исключение NegativeArraySizeException: -3  
      int[] array = new int[3];
      array[0]= 1;
      array[1]= 2;
      array[2]= 3;
      array[3]= 5; // компилятор пропустит, потому что он не знает, что у массива нет элемента под индексом 3, но 
      //  будет исключение: ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
      
      int array2[][] = new int[3][];
        System.out.println(array2[0][1]);// NullPointerException: Cannot load from int array because "array2[0]" is null
        // так как одинарный массив еще не определен
    }
}
