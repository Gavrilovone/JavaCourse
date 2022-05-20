package lesson15_while_do_while;

public class combination_of_cycles {

    public static void main(String[] args) { 

        OUTER:                          // комбинирование loopaми разными циклами
        for (int chas = 0; chas < 24; chas++) {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                System.out.println(chas + ":" + minuta);
                minuta++;

            }

        }

    }

}
