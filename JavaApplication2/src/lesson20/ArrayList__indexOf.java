/*
 *  
 */
package lesson20;

import java.util.ArrayList;

public class ArrayList__indexOf {

    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Пока"));
        list.add(new StringBuilder("Привет"));
        list.add(new StringBuilder("Ок"));
        list.add(new StringBuilder("Helo"));

        for (StringBuilder sb : list) {
            System.out.print(" " + sb);
        }
        // indexOf(Object element) --> int
        System.out.println(list.indexOf("Пока")); // -1 так как данный объект не обнаружен в ArrayList 
        // но со String это работает аналогично смотри remove
         ArrayList<String> list2 = new ArrayList<>();
        list2.add(new String("Пока"));
        list2.add(new String("Привет"));
        list2.add(new String("Ок"));
        list2.add(new String("Helo"));

        for (String sb : list2) {
            System.out.print(" " + sb);
        }
        System.out.println(list2.indexOf("Пока")); // 0  -индекс 
    }
}
