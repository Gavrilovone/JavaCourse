/*
  variables arguments
 */
package lesson19;

public class Test2 {
    // например нам нужно создать метод:

    /*  static void summa(int a, int b){
        System.out.println(a+b);
    }
    static void summa(int a, int b, int c){ // если нам нужно 3 параметра
        System.out.println(a+b+c);
    }
    
    static void summa(int a, int b, int c, int d){// если нам нужно 4 параметра
        System.out.println(a+b+c);
    }  */
    // если их будет бесконечное множество, то это создаст сложности, поэтому придумали  variables arguments или varargs
    static void summa(int... a) { // эта запись говорит, что метод summa можно вызвать с любым количеством аргументов типа int
        // это тоже самое, если бы м записали масив типа int:  static void summa(int[] a)
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i]; // эта запись означает summa = summa+a[i];
        }
        System.out.println(summa);
    }
    
    public static void main(String[] args) {
        summa();// 0
        summa(2,4);//6
        summa(new int []{2,4}); // в случае static void summa(int[] a) пришлось бы писать так. это не всегда удобно
    }
    
    /* Правила:
       1. типа данных может быть любой 
       2. три точки пишутся межжду типом данных и именем переменной
       3. В листе параметров метода может быть только 1 varargs:  static void summa(int... a, double...b) нельзя!
       4. в листе параметров метода varargs должен стоять самым последним: static void summa(int... a, String s) нельзя!
          но если это необходимо, то нужно использовать массив static void summa(int [] a, String s)

    */
}
