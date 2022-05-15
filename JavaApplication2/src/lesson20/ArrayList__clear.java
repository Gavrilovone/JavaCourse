package lesson20;

import java.util.ArrayList;

public class ArrayList__clear {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Привет");
        list.add("Пока");
        list.add("Ок");
// метод clear()--> void  очищает содержимое листа
        list.clear();
        for (String s : list) {
            System.out.print(s + " "); // пусто
        }

    }
}
