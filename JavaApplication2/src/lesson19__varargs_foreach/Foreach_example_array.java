package lesson19__varargs_foreach;

public class Foreach_example_array {

    public static void main(String[] args) {
        // например мы хотим изменить все элементы  массива
        int[] array = {0, 6, 4, 1};
        for (int i = 0; i < array.length; i++) {
            array[i] = 3; // все элементы станут равны 3

        }
        // теперь если вывести на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");// 3 3 3 3
        }

        System.out.println("");

        // если для этого использовать foreach
        int[] array2 = {0, 6, 4, 1};
        for (int a : array2) {
            a = 3;
            // a=0;
            // a=3;
            // a=6;
            // a=3;
            // a=4;
            // a=3
            // a=1; 
            // т.е. меняется переменная а, но сами элементы нет

        }
        // теперь если вывести на экран
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");// 0 6 4 1  значения не поменялись
            // с помощью foraech мы не можем поменять значения примитивных типов данных
        }
        System.out.println("");
        //  для ссылочных типов тоже самое
        StringBuilder sb1 = new StringBuilder("Привет");
        StringBuilder sb2 = new StringBuilder("Пока");
        StringBuilder sb3 = new StringBuilder("Ок");
        StringBuilder[] array3 = {sb1, sb2, sb3};
        for (StringBuilder sb : array3) {
          //  sb = new StringBuilder("Java");  //  так ничего не поменяется
            sb.append("Java"); // но с помощью методов мы можем менять значения объекта, но сам объект не меняется
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");//  ПриветJava ПокаJava OkJava 
        }
    }
}
