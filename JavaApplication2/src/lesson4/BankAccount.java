
package lesson4;


public class BankAccount {
    
    int id;
    String name;
    double balance;
    
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount(); // первый BankAccount это тип данных(тоесть объект BankAccount, а второй BankAccount это вызов конструктора BankAccount()
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        
        MyAccount.id = 1;
        MyAccount.name ="Alexey";
        MyAccount.balance = 100;
        
        System.out.println();
    }
}
