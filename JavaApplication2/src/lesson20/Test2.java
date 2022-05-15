/*
    Методы ArrayList
 */
package lesson20;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // add(daraType element) --> boolean
        list.add("Привет"); // элемент всегда добавляется на последующую позицию
        list.add("Пока");
        list.add("Ок");
        for (String s : list) {
            System.out.print(s + " "); // Пока Привет Ок
        }
        System.out.println("");

        /*1.*/ // add(int index, dataType element)--> boolean
        list.add(1, "Здравствуй"); // индекс указывает на какую позицию добавляется элемент
        for (String s : list) {
            System.out.print(s + " "); // Привет Здравствуй Пока Ок  добавился на 1 индекс, Пока и Ок сместились на  индекс вправо
        }
        /*2*/ // get(int index)--> dataType
        System.out.println("");
        System.out.print(list.get(3)); // Ок  3й элемент ArrayList. get() возвращает элемент, ArrayList
        System.out.println("");

        // с помощью get мы можем вывест на экран все элементы
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " "); // Привет Здравствуй Пока Ок 
        }

        System.out.println("");

        /*3.*/ // set(int index, dataType element) --> dataType element
        list.set(1, "!!!");// set заменяет элемент под индексом 1 на "!!!" 
        for (String s : list) {
            System.out.print(s + " "); // Привет !!! Пока Ок  
        }
        System.out.println("");

        /*4.*/  //Метод remove(Object element) --> boolean. true если элемент удалился
        //      remove(int index) --> dataType возвращает удаленный элемент соответствующего типа
        list.remove(2);// удалился элемент под индексом 2 "Пока"
        for (String s : list) {
            System.out.print(s + " "); // Привет !!! Ок   
        }

        // смотри Test3
        // list.remove(new StringBuilder("Привет")); будет false потому создается новый обект и его нет в ArrayList,
        // соответственно и удалять нечего
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("");
        /*5*/ // Метод addAll(ArraList aL) --> boolean добавляет все элементы сразу
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Петров");
        list3.add("Иванов");
        ArrayList<String> list4 = new ArrayList<>();
        list4.addAll(list3);
        for (String s : list3) {
            System.out.print(s + " ");

        }
        System.out.println("");
        // также можно указать на какой индекс начнут добавляться эти элементы
        // addAll(int index, ArrayList aL) --> boolean
        list.addAll(1, list3);
        for (String s : list) {
            System.out.print(s + " "); // Привет Петров Иванов !!! Ок
            // для String если изменить после этого list3, то list уже на зменится так как объект не меняется, а создается новый
            // для StringBuilder  будет меняться, так как там меняется значение объекта, а не создается объект
        }

        /*6*/ // метод clear()--> void  очищает содержимое листа
        list3.clear();
        for (String s : list3) {
            System.out.print(s + " "); // пусто
        }
       
        /*7*/ // indexOf(Object element) --> int  возвращает индекс первого обнаруженного элемента
    }
}
