package lesson20;

import java.util.ArrayList;

public class ArrayList__get {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Привет");
        list.add("Пока");
        list.add("Ок");
        list.add("Hello");

        // get(int index)--> dataType
        System.out.print(list.get(3)); // Hello  3й элемент ArrayList. get() возвращает элемент, ArrayList
        System.out.println("");

        // с помощью get мы можем вывест на экран все элементы
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " "); // Привет Пока Ок Hello 
        }

    }
}
