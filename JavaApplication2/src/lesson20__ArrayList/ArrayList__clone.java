
package lesson20__ArrayList;

import java.util.ArrayList;
public class ArrayList__clone {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>)list1.clone();
        System.out.println(list1 == list2); // false  ссылаются на разные объекты
        System.out.println(list1.get(0) == list2.get(0)); // true  так как при клонировании второй лист ссылается на те же объекты что и первый
    }
}
