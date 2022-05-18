package lesson20;

import java.util.ArrayList;
// removeAll(Collection<?>c) --> boolean

public class ArrayList__removeAll {

    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        System.out.println("all = " + all);

        ArrayList<String> al2 = new ArrayList<>(); // all = [one, two, three, four, five]
        al2.add("one");
        al2.add("three");
        al2.add("four");
        al2.add("ten");
        
        // если мы хотим удалить из первого Arraylist  all все элементы которые есть во втором ArrayList al2 мы используем метод removeAll
        all.removeAll(al2); 
        System.out.println("all = " + all);// all = [two, five]  а "ten" небыл найден в первом Arraylist и поэтому небыл удален

    }
}
