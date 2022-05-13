package lesson19;

public class Test9 {

    public static void main(String[] args) {
        int[] array1 = {3, 1, -2, 0};
        int[] array2 = {-9, 1, 5, 2};
        // с помощью tradition for loop можно работать с несколькими массивами:
        for(int i = 0; i < array1.length && i<array1.length; i++){ // array1.length && i<array1.length на случай если длины разные
        array1[i] = 12; // меняем все элементы на 12
        array2[i] = 3; //  меняем все элементы на 3
        // Но с помощью foreach loop мы можем работатьс элементами только одного массива
        
        }
    }
}
