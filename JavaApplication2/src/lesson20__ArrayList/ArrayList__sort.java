
package lesson20__ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList__sort {

    public static void main(String[] args) {
        String s5 = "E";
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        // добавим в ArrayList не в таком порядке, в разброс:
        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        list1.add(s5);
        // Collections.sort(ArrayList<DataType>) --> void вызывается с помощью класса Collections. вставляем в параметр ArrayList и он сортирует его
        System.out.println(list1);// [C, A, D, B, E]
        Collections.sort(list1); 
        System.out.println(list1); // [A, B, C, D, E]
    }
}
