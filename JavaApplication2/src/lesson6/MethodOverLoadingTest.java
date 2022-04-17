package lesson6;

/*
   методы OverLoading или перегруженные методы имеют одинаковые имена
   но разные параметры:
   1. разные по типм данных: void method(String s, int a);
   2. разные по количеству параметров: void method(int a, int b);
                                       void method(int a, int b, int c);
   3. разные по порядку: void method(int a, int b);
                         void method(int b, int a);
   и не важно что return type или access modifier будет отличяться

    public int sum(int i1, int 2){
    return i1+i2;
    }
    
    private void sum(int i1, int i2){
   
    }
              будет ошибка! так-как параметры и имя метода одинаковые
 */
public class MethodOverLoadingTest {

    public static void main(String[] args) {
        MethodOverLoading mO = new MethodOverLoading();
        mO.show(20);
        //или можно так:
        // int a = 200;
        //mO.showInt(a)
        mO.show("Привет");
        mO.show(true);
        mO.show("абра кадабра", 0);
    }
}
