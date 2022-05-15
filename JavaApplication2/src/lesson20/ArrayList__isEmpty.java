package lesson20;

import java.util.ArrayList;

public class ArrayList__isEmpty {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Пока"));
        list.add(new String("Привет"));
        list.add(new String("Ок"));
        list.add(new String("Пока"));

        for (String sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println("");
        // isEmpty() --> boolean проверяет пустой ArrayList или нет если пустой то true
        System.out.println(list.isEmpty());// false  не пустой
        list.clear();
        System.out.println(list.isEmpty());// true   пустой

    }
}
