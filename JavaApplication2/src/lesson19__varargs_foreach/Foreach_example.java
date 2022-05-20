package lesson19__varargs_foreach;

public class Foreach_example {

    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int summa = 0;
        for(int a: array){ // a - поочереди принимет значение каждого иэлемента массива
            summa+=a;
        }
        System.out.println("Сумма = " + summa); // Сумма = 11

    }
}
