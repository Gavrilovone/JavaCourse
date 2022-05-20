
package lesson15_while_do_while;


public class do_while_example {
    public static void main(String[] args) {
        int i = 1;
        
        do{
            System.out.println(i);
            i++;
        }
        while(i==10); // даже если условие false, минимум 1 раз цикл сработает. т.е.сначала
    }                 // обрабатывается тело, а потом проверяется условие
}
