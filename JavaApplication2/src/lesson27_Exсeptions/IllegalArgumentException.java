package lesson27_Exсeptions;

import java.util.*;


public class IllegalArgumentException {
    public static void main(String[] args) {
        createPassword("qwerty"); // пароль принят
        createPassword("qwertyegwg343");
    }

    public static void createPassword(String pwd) {
        if (pwd.length() > 6) {
           // throw new IllegalArgumentException("Длинна пароля слишком маленькая");
        }
        if (pwd.length() > 12) {
          //  throw new IllegalArgumentException("Длинна пароля слишком большая");
        }
        System.out.println("Проль принят");
    }
}
