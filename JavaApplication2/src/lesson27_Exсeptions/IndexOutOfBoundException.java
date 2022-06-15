
/**
 * пример выброса IndexOutOfBoundException
 */
package lesson27_Exсeptions;
import java.util.*;
public class IndexOutOfBoundException {
    
}
class Test15{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));
    }
}
/**
 * output:
 * 
 * Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at lesson27_Exсeptions.Test15.main(IndexOutOfBoundException.java:15)
C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\User\AppData\Local\NetBeans\Cache\13\executor-snippets\run.xml:68: Java returned: 1
 */