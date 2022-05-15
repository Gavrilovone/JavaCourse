package lesson20;

import java.util.ArrayList;

public class ArrayList__size {

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
        // size() --> int
        System.out.println(list.size()); // показывает количество элементов в ArrayList

    }
}
