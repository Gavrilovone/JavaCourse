
package lesson5;

// образец метода:
// этот метод показывает, что когда бы мы не подставили в него 3
// числа(аргументы), он вернет нам их сумму
public class Test20 {
    
   int sum(int a, int b, int c){ // a,b,c здесь это параметры
       int result= a+b+c;
       return result;
        }
   // вызов метода в методе:
   int sredneeArfm(int a1, int b1, int c1){
       int result2 = sum(a1,b1,c1)/3;
       return result2;
   }
}
   
   class Test21 {
       public static void main(String[] args) {
        Test20 t = new Test20();
  int summaTrehChisel = t.sum(2,3,6); // 2,3,6 здесь это 
           System.out.println("сумма трех чисел = " + summaTrehChisel);
           System.out.println("Среднее арифмитическое: " + t.sredneeArfm(2,4,6));
       }
   
}
