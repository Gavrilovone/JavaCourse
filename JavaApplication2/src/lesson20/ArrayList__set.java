
package lesson20;

import java.util.ArrayList;


public class ArrayList__set {
     public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Привет");
        list.add("Пока");
        list.add("Ок");
        list.add("Hello");

        // set(int index, dataType element) --> dataType element
        list.set(1, "!!!");// set заменяет элемент под индексом 1(Пока) на "!!!" 
        for (String s : list) {
            System.out.print(s + " "); // Привет !!! Ок Hello
        }
        System.out.println("");

    }
}


