package lesson16;

public class Test4 {

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Urrraaaaaa!!!";
        // метод chaning когда друг за другом через точку пишутся методы:
        String s3 = s1.concat(s2).trim().replace("Urrraaaaaa", "УРА").substring(6, 10);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('w')));
    }

}
