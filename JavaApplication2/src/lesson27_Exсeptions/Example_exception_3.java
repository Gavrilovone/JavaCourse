package lesson27_Exсeptions;

import java.io.*;
/**
 * finally выполняется даже в том случае если в try или catch блоке имеется return statement
 * если в методе есть return statement имеется и в catch блоке и в finally блоке , то output метода будет возвращаемое значение из finally блока
 */
public class Example_exception_3 {

}

class Test7 {
    static int abc(){
     try {
            File f = new File("test.txt");
            var fis = new FileInputStream(f);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман");
            return 6;
        } finally {
            System.out.println("Это блок finally");
        }
    }
    public static void main(String[] args) {
        System.out.println(abc());
    }
    /**
     * Если файл test1.txt который существует, исключение не вылетает и output будет: 
     * Это блок finally
       5
     *
     * Если прописать файл test.txt которого НЕ существует, вылетает исключение и output будет:
       Exception пойман
       Это блок finally
       6
     */
}
