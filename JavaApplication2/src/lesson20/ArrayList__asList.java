package lesson20;

import java.util.*;

public class ArrayList__asList {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        // Array.asList(DataType[]) --> List<Datatype>  вызыввается через класс Array на выходе List того же типа. заметьте не ArrayList, а лист
        StringBuilder[] array = {sb2, sb2, sb3, sb3, sb2};
        List<StringBuilder> list2 = Arrays.asList(array);
        System.out.println(list2); // [B, B, C, C]

        // list2 всегда будет такой же длины , что и массив т.е длина его уже измениться не может. он полностью связан с массивом. И если мы захотим изменить сам объект или его внутренность, то у этого листа отразится тоже самое в отличие методов clone и to Array
        array[0].append("!"); // изменим нулевой элемент
        System.out.println(list2);// [B!, B!, C, C] list2 тоже изменился
        array[0] = new StringBuilder("!"); // заменим нулевой элемент на "!"
        System.out.println(list2);
        System.out.println(sb2); // B!
    }
}
