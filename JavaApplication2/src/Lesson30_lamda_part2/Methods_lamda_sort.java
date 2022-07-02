
package Lesson30_lamda_part2;
import java.util.ArrayList;
import java.util.List;
public class Methods_lamda_sort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(6);
        al.add(4);
        al.add(5);
        al.add(7);
        al.add(3);
        al.add(1);
        System.out.println(al); // [2, 6, 4, 5, 7, 3, 1]
        al.sort((x, y) -> x.compareTo(y));
        System.out.println(al); // [1, 2, 3, 4, 5, 6, 7]
        
        /**
         * метод compareTo сравнивает 2 аргумента и возвращает отрицательное значение, 0 или положительное значение:
         * - отрицательное он возвращает когда 1ый элемент меньше второго
         * - 0 когда они равны
         * - положительное когда 1ый элемент больше второго
         */
        al.sort((x, y) -> -x.compareTo(y)); // для сортировки в обратном порядке добавляем знак "-"
        System.out.println(al); // [7, 6, 5, 4, 3, 2, 1]
    }
}
