package lesson16;

public class Test7 {

    public static void main(String[] args) {
        String x = "Привет";
        String y = "Привет".trim();
        System.out.println(x == y); // true

        String z = " Привет";
        String w = "Привет".trim();
        System.out.println(z == w); // false , так как после метода создается в пуле новый объект
    }
}
