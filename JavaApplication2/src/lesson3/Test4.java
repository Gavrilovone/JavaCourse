
package lesson3;

public class Test4 {
  
    public static void main(String [] args){
         
//        int a=10, b=3;
//        System.out.println(a/b); так как тип переменной int, то дробная часть отсекается
        
      
        int a = 11, b = 3;
//        System.out.println(a/b);
        
        int celayaChast = a/b;
        int ostatok = a%b;
        
//        System.out.println(celayaChast);
//        System.out.println(ostatok);
//        
        
        int x = 5;
        int y = 3;
        int z = x-++y;
        
//        d++ и ++d если он используется отдельно, а не в каком то выражении
//                  то разницы нет, в обоих случаях прибавляет на 1 
        
        System.out.println(z);
        System.out.println(y);
   }
}
