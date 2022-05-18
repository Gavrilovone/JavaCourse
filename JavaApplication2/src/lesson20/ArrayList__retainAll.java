package lesson20;

import java.util.ArrayList;

public class ArrayList__retainAll {

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        System.out.println("all = " + all);

        ArrayList<String> al2 = new ArrayList<>(); // all = [one, two, three, four, five]
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");
        // retainAll(Collection<?>c) --> boolean это противоположный removeAll метод. retain значит сохранять
        // если мы хотим сохранить в первом Arraylist  all все элементы которые есть во втором ArrayList al2 мы используем метод retainAll. остальные элементы которых нет в Arraylist al2  будут удалены.
        all.retainAll(al2);
        System.out.println("all = " + all);// all = [one, three, four]  а "ten" небыл найден в первом Arraylist

    }
}
