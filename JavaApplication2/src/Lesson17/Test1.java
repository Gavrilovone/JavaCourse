/*

 */
package Lesson17;

public class Test1 {

    public static void main(String[] args) {
        // виды  конструкторов StringBuilder:
        StringBuilder sb1 = new StringBuilder(); // первоначальная вместимость по умочанию 16 символов(default)
        StringBuilder sb2 = new StringBuilder("Good day!");// 9+16 - 25 вместимость первоначальная
        StringBuilder sb3 = new StringBuilder(50); // говорит, что его первоначальная вместимость будет 50 символов
        //если мы записываем больше чем вместимость, то создается новый массив чаров, с учетом дополнительного места
        StringBuilder sb4 = new StringBuilder(sb3); // в параметре другой StringBuilder

        // Методы StringBuilder:
        System.out.println(sb2.length()); // 9
        System.out.println(sb3.length()); // 0  так как элементов 0

        System.out.println(sb2.charAt(5)); // d

        System.out.println(sb2.indexOf("a")); // 6 в отличие от String, StringBuilder принимает  в параметр только String
        System.out.println(sb2.indexOf("day", 1)); // 5 

        String s = sb2.substring(5);
        System.out.println(s); // присвой s кусок начиная с 5 индекса
        s = sb2.substring(5, 6);
        System.out.println(s); // d ,  "a"  уже не включается, так как с 5 по 6 индекс, но невключительно

        System.out.println(sb2.subSequence(5, 6));// работет так же как и substring, только выводит последовательность char? а не String

        sb2.append(22); // добавляет в конец то что указано в параметре(любой примитивный тип данных или объект), возвращает StringBuilder
        System.out.println(sb2); // Good day!22
        sb2.append(sb2);
        System.out.println(sb2);// Good day!22Good day!22

        System.out.println(sb2.insert(4, 55));// Good55 day!22Good day!22  вставляет с 4 индекса 55, этот метод это расширение append

        StringBuilder sb5 = new StringBuilder("Hello World");
        System.out.println(sb5.delete(3, 6)); // HelWorld   удаляет начиная с 3 и до 6 индекса,  так же до 6 не включая его
        
        StringBuilder sb6 = new StringBuilder("Hello World");
        System.out.println(sb6.deleteCharAt(6)); // Hello orld  удаляет символ на конкретном индексе, в данном случае на 6м
        System.out.println(sb5.reverse());// dlroWleH  делает реверс, первый символ стал последним, второй предпоследним и т.д.
        
        StringBuilder sb8 = new StringBuilder("Всем привет!");
        sb8.replace(0, 5, "Пете");
        System.out.println(sb8); // Петепривет! с нулевого по пятый индекс замени на "Пете"
        System.out.println(sb8.capacity()); // 28  возвращет int и показывает скольно мест в данном StringBuilder  12+16
        

    }
}
