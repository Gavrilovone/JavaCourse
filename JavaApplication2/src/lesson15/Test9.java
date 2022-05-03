package lesson15;

public class Test9 {

    public static void main(String[] args) {
        int chas = 0;
        OUTER:
        do {
            int minuta = 0;
            INNER:
            while (minuta < 60) {
                if (minuta == 20){  // цикл будет бесконечный, так как компилятор будет доходить до 20 и переходить
                    continue OUTER; // на следующий час и час будет начинаться снова с нуля, до chas++ не дойдет
                }
                System.out.println(chas + ":" + minuta);
                minuta++;

            }
            chas++;

        } while (chas < 24);

    }

}
