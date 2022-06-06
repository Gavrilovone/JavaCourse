
package lesson25_Polymorphism;
 /**
     * У примитивных типов данных термин upcasting и downcasting заменяется другими терминами восновном (widening расширение) 
     * т.е.когда из меньшего типа данных преходим в больший, существует 19 форм
     * byte to short, int, long, float or double
     * short to int, long, float or double
     * char to int, long, float or double
     * int to long, floate or double
     * long to float or double
     * float to double
     * 
     * Narrowing(сужение) without casting - проиходит  если выполняется 3 условия:(1) тоесть кастить вручную уже не надо
     * 1.Если int кастится в byte short или char
     * 2.Если int это константа (2) 
     * 3.Если значение int помещаетс в соответствующий тип даных
     * 
     * Существует 22 формы narrowing, когда мы пытаемся больший тип поместить в еньший:
     * short to byte or char
     * char to byte or short
     * int to byte, short or char
     * long to byte, short, char or int
     * float to byte, short, char, int or long
     * double to byte, short, char, int, long or float
     */

public class Primitive_data_types_casting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(7);
        /** 
         * здесь никакого каста нет потому что удовлетворяется 3 условия(1)
         */
        byte b2 = 3; //  3 это константа  (2)
        short s1 = -6;
        char c1 = 100;
        byte b3 = 127; // 127 влезает в диапазон int (3)
        /**
         * byte b4 = 128; 128 не влезает в диапазон int по-этому ошибка (3)
         */
        int i1 = 3;
        short sh = (short)i1; // пусть i1 воспринимается как short и тогда я смогу назначить его переменной sh(это уже Narrowing with casting)
        int i10 = 111111;
        short s10 = (short)i10;
        System.out.println(s10);// -19961  
        /**
         * изза того что int не смог помемтится в short мы потеряли определенного рода нужную нам часть информации, потому что такой
         * огромный int не смог поместится в short у которого диапазон от 0 до 65 635
         */
        
        
    }
}
