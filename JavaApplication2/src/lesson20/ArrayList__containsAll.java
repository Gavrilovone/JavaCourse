package lesson20;

import java.util.ArrayList;

public class ArrayList__containsAll {

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
        // containsAll(Collection<?>c) --> boolean
        // метод containsAll проверяет содержит ли ArraList all все элементы ArrayList2
        boolean result = all.containsAll(al2);
        System.out.println(result); // false

    }
}
