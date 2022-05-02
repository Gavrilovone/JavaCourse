package Lesson14;

public class Test4 {

    public static void main(String[] args) {

        int a = 9;

        if (a > 10) {
            for (int i = 1; i <= 10; i++) { // к statement for относятся 
                System.out.println(i);     //  оба предложения
                System.out.println("Привет"); // если нет скобок выполняться уже не будет
            }    //  всегда лучше писать скобки!
        }

    }
}
