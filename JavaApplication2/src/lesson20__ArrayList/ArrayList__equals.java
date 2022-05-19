package lesson20__ArrayList;
// ArrayList<DataType>) --> boolean

import java.util.ArrayList;

public class ArrayList__equals {

    public static void main(String[] args) {

        String s1 = "A";
        String s2 = "B";
        String s3 = "C";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s2);
        list1.add(s1);
        list1.add(s3);

        ArrayList<String> list2 = list1;
        System.out.println(list1.equals(list2)); // true

        ArrayList<String> list3 = new ArrayList<>();
        list3.add(s2);
        list3.add(s1);
        list3.add(s3);

        System.out.println(list1.equals(list3)); // true
        // таким образом метод equals в ArrayList перезаписан. два ArrayList являются одинаковыми, если у них одинаковые элементы и одинаковый порядок 

    }
}
