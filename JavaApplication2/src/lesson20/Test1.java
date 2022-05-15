/*
   ArrayList это структура Колллекций. AarrayList является одним из листов. list в переводе с английского список. 
   Лист это такая структура данных? которая содержит в себе неупорядоченные элементы, которое допускает в себе содержание
   повторяющихся дублированных элементов и элементы этой структуры прономированны/ т.е. здесь наблюдается индексация так же
   как в массиве. соответственно все эти характеристики от List перенял в себе ArrayList.
   
   Мы используем ArrayList там где необходимо изменять удалять элементы 
   
   В основе ArrayList лежит массив типа Object{}. Массив типа Object может содержать в себе любые reference типы данных, но 
   не примитивные. поэтому элементами ArrayList могут быть любые объекты
 */
package lesson20;

import java.util.ArrayList; // чтобы использовать  короткое имя ArrayList , нужно импортироват его из пакета java.util
import java.util.List; // импортировали для примера с синатксисом List

public class Test1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Привет"); // метода который добавляет в ArrayList элементы
        Car с = new Car();
        list.add(с); // добавили объект с
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("Ок")); // можем добавить объект StringBuilder
        // мы добавили в ArrayList элементы различных типов данных: Car, Student.. но так почти никто не делает. обычно 
        // в ArrayList добавляют элементы определенного типа данных

        ArrayList<String> list2 = new ArrayList<String>(); // теперь элементами ArrayList  могут быть только String
        // ArrayList<String> list2 = new ArrayList<>() можно так, это одно и тоже
        // ArrayList<String> list2 = new ArrayList<>(55) cappasity 55 это вместимость , колличество возможных элементов
        list2.add("Пока");
        // list2.add(s);// ошибка, нельзя добавить, так как он не String

        List<StringBuilder> list3 = new ArrayList<>(); // такая запись так же корректна, так как List это родитель ArrayList
        ArrayList<String> list4 = new ArrayList<String>(list2); // List2 и list4 ссылаются на разные объекты
        System.out.println(list2 == list4); // false 
        
        // ArrayList<int> list2 = new ArrayList<int>(); нельзя , в качестве типа данных указывать примитив
        List<Integer> list5 = new ArrayList<>(); // можно, так как Int это уже reference тип данных, класс wrapper (обертка)
        
    }
}

class Car {
}

class Student {
}
