package lesson27_Exсeptions;

import java.io.*;

public class Example_exception_4 {

}

class Test8 {

    void abc() throws FileNotFoundException {
        try {
            File f = new File("test.txt");
            var fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception пойман и немного обработан");
/**
 * допустим мы поймали exception, но мы не можем его полностью обработать, мы его частично обработали
 * и мы можем его заново перебросить(выбросить), это называется rethrowing:
 */
        throw e; 
        /**
         * но из-за того, что мы опять бросаем checked exception мы должные его объявить в методе 
         */
        } finally {
            System.out.println("Это блок finally");
        }
    }
}
