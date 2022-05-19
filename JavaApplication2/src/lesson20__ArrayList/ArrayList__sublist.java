package lesson20__ArrayList;
// subList(int fromindex, int to index) --> List<E>  создает из имеющегося ArrayList  subList(т.е его отрывок)
// и возвращает уже не ArrayList, а List

import java.util.ArrayList;
import java.util.List;

public class ArrayList__sublist {

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        System.out.println("all = " + all);
        
        List<String> sublist = all.subList(1, 3);// 3й элемент не будет включен в subList
        System.out.println("sublist = " + sublist); // sublist = [two, three]
        
        // subList не существует отдельно от Arraylist all, он лишь является его представлением(или на английском звучит)
        // view в наш ArrayList
        
        sublist.add("ten");
        System.out.println("all = " + all);  //           all = [one, two, three, ten, four, five]
        System.out.println("subList = " + sublist);// subList = [two, three, ten]
        //  "ten" добавился и в ArrayList all, а так как у sublist 3 элемента, то в all "ten" добавился с индекса 3
        // Все структурные модификации нужно делать в нашем view т.е в sublist. Если мы попытаемся добавить в Arraylist all
        // элемент, то при попытке вывести на экран sublist выйдет exception
    }
}
