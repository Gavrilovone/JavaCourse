package lesson20__ArrayList;

import java.util.*;

public class ArrayList_primer {

    public static void main(String[] args) {
        ArrayList all = new ArrayList(); // без скобок - дженериков (указания конкретного типа компилятор не ругается)
        all.add(new Test1()); // но если мы получаем этот лист откуда-то, то мы не можем быть уверены в том, что
        all.add("one");      //  данный лист содержит элементы только одного типа String например
        all.add("two");   // при использовании дженериков, компелятор уже здесь  all.add(new Test1()); сообщил бы об ошибке
        all.add("three");
        all.add("four");
        all.add("five");

        for (Object o : all) { // так как мы не указывали типа <String>  и теперь элементы all это тип Object
            System.out.println("номер = " + o + " , длина = " + ((String) o).length());
//                                                                                         номер = one , длина = 3
//                                                                                         номер = two , длина = 3
//                                                                                         номер = three , длина = 5
//                                                                                         номер = four , длина = 4
//                                                                                         номер = five , длина = 4
        }
    }
}
