package lesson6_overloadingMethods_this;

public class Test1 {

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sredArifm(int a, int b, int c) {
        return (a + b + c) /3;
    }

    // но если код в методе будет большой, то будет проще взять часть
    // кода из уже имеющего метода в данном примере это a+b+c:
    int sredArifm2(int x, int y, int z) {
        return sum(x, y, z)/3; // тоесть эти параметры мы подставляем в метод sum
    }
}
