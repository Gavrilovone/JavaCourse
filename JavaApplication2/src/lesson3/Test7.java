
package lesson3;


public class Test7 {
    
    public static void main(String [] args){
    
    int a=5;
    int b=10;
    
    System.out.println(a>b); // false
    System.out.println(!(a>b)); // true 
    
    // short circuit - оператор которы не  всегда полностью выполняется
   // например false $$ true например первй операнд false и второй уже java не смотрит
   // и например true || false первый операнд true и дальше java уже не смотрит
   // bitwise операторы - & и | - тоже самое, но java выполняет все части программы. так же они могут работать с числами, но операция 
   // сравнения происходит в бинарной системе
   // bitwise exclusive or ^ - возвращает true только если один из  всех операндов true. если их больше , то будет false
   
     int c=20;
     int d=50;
     int e=0;
     int m=100;
     
boolean k=c>m && e<d ;

System.out.println(k);
   
    }
    
}
