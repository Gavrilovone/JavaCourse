package lesson20;

import java.util.ArrayList;

public class ArrayList__remove {

    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Привет");
        StringBuilder sb2 = new StringBuilder("Пока");
        StringBuilder sb3 = new StringBuilder("Ок");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).append("!"); // на каждой итерации мы вызываем каждый элемент через get и добавляем !!! к нему
        }

        for (StringBuilder sb : list) {
            System.out.println(sb + " ");
        }
        System.out.println("");
        // 1. удаление по объекту
        //Метод remove(Object element) --> boolean. true если элемент удалился
        // list.remove(new StringBuilder("Привет")); будет false потому создается новый обект и его нет в ArrayList,
        // соответственно и удалять нечего

     // list.remove(new"Привет"));
        list.remove(new StringBuilder("Привет")); // ничего не удалится, потому что создался новый объект"Пока" java сравнивает его через equals с элементами list, а так как в StringBuilder он не перезаписан и это тоже самое что и ==. true будет только в случае если это будут две ссылки на один объект
        list.remove(sb1); // удаление объекта sb1 произойдет так как новый объект не создается
        for (StringBuilder sb : list) {
            System.out.println(sb + " "); // Пока Ок  
            // Но со String , даже если  list.remove(new String("Привет")); удаление произойдет, метoд equals в String перезаписан и возвращает true если порядок символов и их значения совпадают, даже если при этом  ссылки на разные объекты 

        }

        System.out.println("");
        // 2. удаление по индексу
        //    remove(int index) --> dataType возвращает удаленный элемент соответствующего типа
        list.remove(1);// удалился элемент под индексом 1 "Пока" 
        for (StringBuilder s : list) {
            System.out.print(s + " "); // Пока   
        }

    }
}
