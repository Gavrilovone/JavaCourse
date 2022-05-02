package lesson8;

/* - final varibals должны быть проинициализированы до их использования:
   1. При определении переменной
   2. Или в каждом конструкторе(если переменная не static) если stаtic , то только при создании
      Если конструкторов несколько, то в каждом она может принимать разные значения.
   
   - В каком порядке не имеет значение но обычно первым ставят public

   - У final переменной нет дефолтного значения, поэтому final int a;
   выдаст ошибку компилятора
   




 */

public class Test1 {
    public final int a = 10;
    final int b;
    Test1() {
        b = 10;
    }

    Test1(Boolean b1) {
        b = 15;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
    }
    
    public void abc(final short s){  
    byte b;
    b = 10;
   // s++; будет ошибка так-ак параметр s нельзя изменить внутри метода, так как он final 
        System.out.println(b+s);
    }
    

}
