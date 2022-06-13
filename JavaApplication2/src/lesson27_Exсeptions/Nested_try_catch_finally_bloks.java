package lesson27_Exсeptions;

import java.io.*;

public class Nested_try_catch_finally_bloks {

}

class Test10 {

    FileImputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileImputStream("test1.txt");
            try {
                fis2 = new FileImputStream("test.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file test not found");
            }

        } catch (FileNotFoundException e) {
            System.out.println("file test1 not found");
        } finally {
            System.out.println("Это внешний finally блок");
            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Найдено исключение в finally блоке ");
            }
        }
    }
    public static void main(String[] args) {
        Test10 t = new Test10();
        t.abc();
    }
}
