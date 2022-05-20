package lesson15_while_do_while;

public class neumestnoe_ispolsovanye {

    public static void main(String[] args) {
        int money = 0; // в данном примере не уместно использовать do while
        do {
            System.out.println("Делайте ставку!");
            System.out.println("Вы проиграли!");
            money = money - 10;
        } while (money > 50);
    }
}
