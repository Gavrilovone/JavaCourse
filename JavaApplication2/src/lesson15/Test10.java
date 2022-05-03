package lesson15;

public class Test10 {

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
