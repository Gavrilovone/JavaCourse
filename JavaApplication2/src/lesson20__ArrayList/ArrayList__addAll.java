package lesson20__ArrayList;

import java.util.ArrayList;

public class ArrayList__addAll {

    public static void main(String[] args) {
        /*5*/ // Метод addAll(ArraList aL) --> boolean добавляет все элементы сразу
        ArrayList<String> list = new ArrayList<>();
        list.add("Петров");
        list.add("Иванов");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list); // добавляем в пустой list2 все элементы list
        for (String s : list2) {
            System.out.print(s + " ");// Петров Иванов 

        }
        System.out.println("");
        // также можно указать с какого индекса начнут добавляться эти элементы
        // addAll(int index, ArrayList aL) --> boolean
        list.addAll(1, list2);
        for (String s : list) {
            System.out.print(s + " "); // Петров <Петров Иванов> Иванов
            // для String если изменить после этого list2, то list1 уже на зменится так как объект не меняется, а создается новый

        }
        System.out.println("");
        list2.set(0, "Гаврилов");
        for (String s : list) {
            System.out.print(s + " ");
        }
        // для StringBuilder  будет меняться, так как там меняется значение объекта, а не создается объект
    }
}
