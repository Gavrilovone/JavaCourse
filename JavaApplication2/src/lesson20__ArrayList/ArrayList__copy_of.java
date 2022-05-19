package lesson20__ArrayList;

import java.util.ArrayList;
import java.util.List;


public class ArrayList__copy_of {

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        // List.copyOf(Collection<E>c) --> List<E>
        
        List<String> list = List.copyOf(all);//  копируем содержимое листа all в list 
        System.out.println(list); // [one, two, three, four, five]
        // эти листы не могут содержать элементы null  и немогут быть изменены в дальнейшем

    }
}
