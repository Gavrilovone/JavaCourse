
package lesson20;

import java.util.ArrayList;


public class ArrayList__LastIndexOf {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("Пока"));
        list.add(new String("Привет"));
        list.add(new String("Ок"));
        list.add(new String("Пока"));

        for (String sb : list) {
            System.out.print(" " + sb);
        }
        
        System.out.println("");
        // indexOf(Object element) --> int выдает самый последний индекс на котором находится искомый объект. в данном случае два "Пока" и второй находится на индексе 3
        System.out.println(list.lastIndexOf(new String("Пока"))); // 3 
    }
}


