
package lesson20__ArrayList;

import java.util.ArrayList;


public class ArrayList__toString {
    public static void main(String[] args) {
         ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Пока"));
        StringBuilder sb = new StringBuilder("Привет");
        list.add(sb); 
        list.add(new StringBuilder("Ок"));
        list.add(new StringBuilder("Пока"));
        // toString() --> String  чтобы не использовать для вывода элементов ArrayList for или foreach. Показывет как наш объект выглядит на экране
        System.out.println(list.toString()); // [Пока, Привет, Ок, Пока]
    }// но вообще метод toString вызывается автоматически при попытке вывести на экран любой объект и других классов, не только ArrayList
}
