package lesson27_Exсeptions;

import java.io.*;

public class Nested_try_catch_finally_bloks {

}

class Test10 {

    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test1.txt");
            try {
                fis2 = new FileInputStream("test.txt");
            } catch (FileNotFoundException e) {
                System.out.println("file test not found");
            }

        } catch (FileNotFoundException e) {
            System.out.println("file test1 not found");
        } finally {
            System.out.println("Это внешний finally блок");
            try { // try блок который пытается закрыть 2 потока fis1 и  fis2
                fis1.close();// записали это в блоке try потому что метод close может выбрасывать IOException, этот поток откроется
                fis2.close();
                /**
                 * этот поток  fis2.close(); не закроется, потому, что он открыт небыл, так как файла text.txt не сущетвует и применение метода close на null
                 * выбросит NullPointerException
                 */
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

/**
 * output: 
 *          file test not found
            Это внешний finally блок
            Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.FileInputStream.close()" because "this.fis2" is null
            at lesson27_Exсeptions.Test10.abc(Nested_try_catch_finally_bloks.java:28)
            at lesson27_Exсeptions.Test10.main(Nested_try_catch_finally_bloks.java:40)
            C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
            C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1
            BUILD FAILED (total time: 1 second)

 */
