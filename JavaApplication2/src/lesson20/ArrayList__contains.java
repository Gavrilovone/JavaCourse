package lesson20;

import java.util.ArrayList;

public class ArrayList__contains {

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
        // contains(Object element) --> boolean проверяет есть ли объект в  ArrayList  или нет. также работает с equals
        System.out.println(list.contains("Пока"));//true

        // для StringBuilder 
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Пока"));
        StringBuilder sb = new StringBuilder("Привет");
        list2.add(sb); // добавляем уже reference
        list2.add(new StringBuilder("Ок"));
        list2.add(new StringBuilder("Пока"));
        System.out.println(list2.contains(new StringBuilder("Пока")));// false
        System.out.println(list2.contains(sb));// true так как новый объект не создается  и equals сравнивает sb  с sb

    }
}
