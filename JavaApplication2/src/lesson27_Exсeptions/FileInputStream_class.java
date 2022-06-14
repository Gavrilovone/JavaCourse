
package lesson27_Exсeptions;
import java.io.*;
public class FileInputStream_class {
    /**
     * класс FileInputStream - предназначен для создания потока, с помощью которого можно читать информацию из источника
     */
    
    public static void main(String[] args) throws Exception {
        File f = new File("test.txt");
      FileInputStream fis = new  FileInputStream(f); // в параметре указываем к какому файлу будем обращаться
        fis.read(); // с помощью этого потока можно читать что-то
    }
}
