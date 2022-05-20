/*
 
 */
package lesson15_while_do_while;
public class while_example_delayte_stavku {
    public static void main(String[] args) {
        int money = 100;
        while (money > 0) {
            System.out.println("Делайте ставку!");
            System.out.println("Вы проиграли!");
            money = money-10;
        }
    }

}

/*output:

Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!
Делайте ставку!
Вы проиграли!

*/