package lesson16;

public class Test6 {

    public static void main(String[] args) {
        String s1 = new String("Ok");
        String s2 = new String("Ok");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2));// true

        String s3 = "Ok";
        String s4 = "Ok";
        System.out.println(s3 == s4); // true 
        System.out.println(s3.equals(s4)); // true 
        
        String s5 ="Как дела";
        String s6 ="как Дела";
        System.out.println(s5.equals(s6));// false
        System.out.println(s5.equalsIgnoreCase(s6));// true  игнорирует регистр и сравнивает просто chars
    }
}
