/*
   1. метод length() - парметров не принимает, возврашает int. показывает длину массива char

   2. метод charAT(int index) - возвращает char. Показывает какой символ char находится на нужном нам индексе

   3. indexOf(char c)
      indexOf(String s)
      indexOF(char c, intfromindex)
      indexOF(String s, intfromindex)    все отни возвращают int.  показывают на каком индексе находится конкретный String или char
    
   4. startsWith(String prefix)
      startsWith(String prefix, int from) - оба возвращают boolean

   5. endsWith(String sufix) - такая же функциональность работы, только отвечает на вопрос "заканчивается ли"

   6. substring(int beginindex)
      substring(int beginindex, int endindex) - возвращают String

   7. trim() -  не принимает ни какие параметры, возвращает String
 */
package lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("Привет");
        String s2 = new String("jkjhrkjh");

        int a = s1.length();
        System.out.println("Длина слова привет: " + a);

        char b = s1.charAt(4);
        System.out.println("В слове Привет под 4 индексом находится символ: " + b);

        int i1 = s1.indexOf('и');
        System.out.println(i1);
        int i2 = s1.indexOf("ве"); // индекс начиная с первого совпадения
        System.out.println(i2);
        int i3 = s2.indexOf('j', 3); // в аргументах вводим символ который надой найти, второй параметр с какого индекса искать
        System.out.println(i3);
        int i4 = s2.indexOf("kj", 0); // тоже самое, только для String. если символа такого нет, то на экран выведется -1
        System.out.println(i4);
        
        boolean b1 = s1.startsWith("Пр"); // начинается с Пр?, если да, то true
        System.out.println(b1);
        boolean b2 = s1.startsWith("в", 3); // с индекса 3 начинается с Пр?, если да, то true
        System.out.println(b2);
        boolean b3 = s1.endsWith("в"); // заканчивается ли на в? . нет - false
        System.out.println(b3);
        
        String s3 = s1.substring(2); // присвой s3 кусок начиная с 2 индекса
        System.out.println(s3);// ивет
        
        String s4 = s1.substring(2,4); // присвой s3 кусок между индексами 2 и 4
        System.out.println(s4);
    }

}
