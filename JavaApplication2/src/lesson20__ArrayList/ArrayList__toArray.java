package lesson20__ArrayList;

import java.util.ArrayList;

public class ArrayList__toArray {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        // метод toArray создает новый массив и reference его елементов ссылаются на те же элементы, что лежат в основе ArrayList
        // toArray() -->Object[]
        // toArray(DataType[] array) --> DataType возвращает массив типа данных который мы указываем в параметре
        Object[] array = list1.toArray(); // output метода toArray это массив
        for (Object o : array) {
            System.out.print(o + " "); // A B С
        }
        
        StringBuilder[] array2 = list1.toArray(new StringBuilder[10] );// Из list1 сделали  массив StringBuilder
        for(StringBuilder sb: array2){
            System.out.println(sb + " ");// А В С null null null null null null null
        }
        
    }
}
