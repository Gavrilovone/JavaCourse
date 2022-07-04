package lesson31_Generics;

import java.util.ArrayList;

/**
 * Parametrized методы это методы у которых в параметр листе есть generics
 */
public class Parametrized_methods {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(150);
        int a = GenMethod.getSecondElement(al1); // int a будет назначаться 2му элементу(второй элемент это 30)
        System.out.println(a); // 30
        
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        String s =  GenMethod.getSecondElement(al2);
        System.out.println(s); // b
    }
}

class GenMethod {

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1); // в методе хотим постоянно возвращать 2й элемент arrayLista
    }
}
