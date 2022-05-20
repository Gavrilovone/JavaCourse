package lesson19__varargs_foreach;

public class Foreach_example_Dinamic_initialization_not {

    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;

            //  for(int b:array){
            // b = 10;           элементы не изменятся, 10 присваивается только переменной b
            // такми образом с помощью foreach loop мы не можем производить динамическую инициализацию массива
            //  }
        }

        for (int a : array) {
            System.out.print(a + " ");
        }
    }

}
