package Lesson17;

public class Test2 {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        StringBuilder sb5 = sb1; //  sb3 ссылается на то же объект
        sb2 = sb2.append(6).append(7);
        System.out.println(sb1); // 1234567
        System.out.println(sb2); // 1234567

        StringBuilder sb3 = new StringBuilder("123");
        StringBuilder sb4 = new StringBuilder("123");
        System.out.println(sb3 == sb4); // false
        System.out.println(sb3.equals(sb4)); // false   в классе StringBuilder equals работает не так как в классе String, работает так же как ==
        System.out.println(sb1.equals(sb5)); // true

        // еще 2 конструктора класса String:
        StringBuilder sb6 = new StringBuilder("Привет");
        StringBuilder sb7 = new StringBuilder("Пока");
        String s1 = new String(sb6);
        String s2 = new String(sb7);// в String можно передавать в параметр StringBuilder, а в StringBuilder можно передавать в параметр String
    }
}
