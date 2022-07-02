package Lesson30_lamda_part2;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Scope_variables {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        for (String s : al) { // переменная s уже есть здесь
            //  Predicate<String> p = s -> s.length() > 4 ; - поэтому тут ошибка что переменная s уже определена

            String m = "hi";
            for (String s1 : al) {
                Predicate<String> p = z -> {
                    System.out.println(m.length()); 
                    return z.length() > 4;};
                
                /**
                 * мы можем использовать переменную m  в лямда выражении, но только если она либо final либо она effectively(тоесть не меняется)
                 * если мы попытаемся изменить переменную m например String m = "hi!!"; то она перестает быть effectively и в лямда выражении уже ее
                 * использовать нельзя, компилятор будет ругаться
                 */

            }
        }
    }
}
