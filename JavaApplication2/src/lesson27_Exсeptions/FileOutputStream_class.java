
package lesson27_Exсeptions;
import java.io.*;
public class FileOutputStream_class {
    /**
     * FileOutputStream - предназначен для создания потока, с помощью которого можно писать информацию в источник
     */
    
    public static void main(String[] args) throws Exception {
         File f2 = new File("test1.txt");
        FileOutputStream fos = new FileOutputStream(f2);
        fos.write(100);  // записываем char 100 в файл test1 (100 это символ d)
    }
}
