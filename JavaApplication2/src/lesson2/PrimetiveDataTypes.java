
package lesson2;

public class PrimetiveDataTypes {
    public static void main (String [] args){
        
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;
        
        short s1 = 5;
        short s2 = -10;
        short s3 = 0;
        
      
        
        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 51L;
        
        float f1 = 3.14F;
        float f2 = 2.5F;
        float f3 = 20.0f;
        
        double d1 = 5.5;
        double d2 = 87.65;
        
        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';
        char c5 = 136;  // 300й символ в юникоде. bcgjkmpetncz 10 система исчисления
        char c6 = '\u05AB'; // используется 16ричная система исчисления. помимо цифр, используются еще буквы ABCDEF
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        int a1 = 60;
        int a2 = 0B111100; //0B или 0b показывает что исчисление  в двоичной системе, числа кроме 1 и 0 написать нельзя, будет ошибка
        int a3 = 074; // 0 показывает что исчисление в восмеричной системе, используются числа от 0-7
        int a4 = 0x3C; // 0 показывает что исчисление в шестнадцатиричной системе, используются числа от 0-F
        int a5 = 0X3c; // регистр значения не имеет
        int a6 = 100000;
        int a7 = 1_000_000; // символ underscore '_'  для более читабельного вида 1___0_____0 в консоль выводится без него
        
        System.out.println(a4);
}
}