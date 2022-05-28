package lesson23_Overriding_Hiding_Final;

public class Example3 {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B()); // A
    }
}

class A {

    void abc(A a) {
        System.out.println("A");
    }
}
class B extends A {

    void abc(B b1) {
        System.out.println("B");
    }
}
class C extends B {

    @Override
    void abc(B b2) {
        System.out.println("C");
    }
}
/**
 * метод abc в классе B не являетя перезаписанным, так как у метода abc в классе A и у метода abc в классе B разная сигнатура,
 * в классе A у него в параметре типа A а у B в параметре тип B(тоесть разные параметры) метод являются перегруженным но не 
 * перезаписанным
 * Мы создаем переменную с1, ее тип A  c1.abc(new B());  компилятр сначала проверяет сигнатуры
 * Вспомним правило, что с помощью переменной типа Parent класса которая ссылается на объект sub класса мы можем вызывать только
 * те элементы которые есть в parent классе, следовательо ни о каком вызове метода из класса B(и С так как он перезаписан) речи 
 * быть не может поэтому вызывается метод из класса A
 * 
 */