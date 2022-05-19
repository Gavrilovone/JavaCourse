package lesson21__PovtorenyeMelochey;

public class TernaryOperator {

    // booleanExpression ? expression1 : expression2   если true срабатыввет первый если false второй
    // Единственный Оператор который использует 3 операнда
    // expression1 и expression2 должны возвращать какое-то значение. просто System.out.println например написать сюда не сможем
    // но нет требования , чтобы они возвращали один тип данных
    public static void main(String[] args) {
        int a = 4;
        System.out.println(a < 4 ? 7 : "Привет"); // Привет     Выводи 7 если a<4 true и "Привет" если a<4 false
        // int b =  System.out.println(a < 4 ? 7 : "Привет"); так нельзя! потому что если a<4 вернет false, то мы переменной типа
        // int не сможем присвоить значение типа String
        int b = 5;
        int c = 5;
        int d = b < c ? b++ : c++;
        
        System.out.println("b = " + b);  // 5
        System.out.println("c = " + c); //  6
    }
}
