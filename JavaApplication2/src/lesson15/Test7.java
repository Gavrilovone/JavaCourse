package lesson15;

public class Test7 {

    public static void main(String[] args) {
        int money = 0; // в данном примере не уместно использовать do while
        do {
            System.out.println("Делайте ставку!");
            System.out.println("Вы проиграли!");
            money = money - 10;
        } while (money > 50);
    }
}
