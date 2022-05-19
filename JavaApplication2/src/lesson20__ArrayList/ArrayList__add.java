package lesson20__ArrayList;

import java.util.ArrayList;

public class ArrayList__add {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // add(daraType element) --> boolean добавляет элементы в ArrayList
        list.add("Привет"); // элемент всегда добавляется на последующую позицию
        list.add("Пока");
        list.add("Ок");
        for (String s : list) {
            System.out.print(s + " "); // Пока Привет Ок
        }
        System.out.println("");

        // add(int index, dataType element)--> boolean
        list.add(1, "<Здравствуй>"); // индекс указывает на какую позицию добавляется элемент
        for (String s : list) {
           System.out.print(s + " "); // Привет Здравствуй Пока Ок  добавился на 1 индекс, Пока и Ок сместились на  индекс вправо
        }
    }
}
