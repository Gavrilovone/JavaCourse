/**
 *  Type Erasure -  стирание типа, этот механизм очень важен для обратной совместимости и сильно влияет на метод оверайдинг и оверлодинг
 */
package lesson31_Generics;

import java.util.ArrayList;

public class Type_erasure {
    public static void main(String[] args) {
         ArrayList<Integer> al1 = new ArrayList<>();
         /**
          * но JVM это видит по-другому, для нее это написание вот такое:
          * 
          * ArrayList al1 = new ArrayList();
          * 
          * следовательно когда мы пишем:
          * int i = al1.get(0);
          * JVM видит это в таком виде:
          * int i = (Integer)al1.get(0); происходит кастинг потому что без кстинга для роттайп al1.get(0) возвращает Object
          * и Object сначала кастится, а потом назначается этой переменной i - это называется стирание типов и это необходимый механизм для обратной совместимости
          * 
          * 
          */
    }
}
