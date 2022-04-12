
package HomeWork;


public class lesson5_1 {
    
}




class BankAccount {
  double popolnenyeScheta(double i){
        double result;
        result = balance+i;
        return result;
   
    }
  
   double snyatyeScheta(double i){
        double result;
        result = balance-i;
        return result;
   
    }
    
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
        
        YourAccount.id = 2;
        YourAccount.name ="Sergey";
        YourAccount.balance = 150;
        
        HisAccount.id = 3;
        HisAccount.name ="Ivan";
        HisAccount.balance = 130;
        
        System.out.println(MyAccount.popolnenyeScheta(17.5));
        System.out.println(MyAccount.snyatyeScheta(16.2));
        
       
    }
}
