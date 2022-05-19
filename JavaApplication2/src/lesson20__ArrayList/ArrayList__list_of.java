package lesson20__ArrayList;


import java.util.List;

public class ArrayList__list_of {

    public static void main(String[] args) {

        // List.of(E/... elements) --> List<E>
        List<String> list = List.of("один", "два", "три"); // мы создали List без использования метода add , что иногда удобно
        System.out.println("List = " + list); // List = [один, два, три]
        // этот лист невозможно модифицировать, т.е добавить или удалить элементы уже нельзя
         // эти листы не могут содержать элементы null

    }
}
