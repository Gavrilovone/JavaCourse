package lesson25_Polymorphism;

public class Example_casting_with_array {

    public static void main(String[] args) {
        String[] array1 = {"Hello", "Bay"};
        Object[] array2 = array1;// можем так написать, потому что любой массив является масивом типа Object(Upcasting)
        /**
         * String [] array3 = array2; - компилятор ругается, потому что не любой массив Object это массив типа String
         * тут нам необходимо делать casting вручную:
         */
        String [] array3 = (String[])array2;
        /**
         * Если мы захотим написать:
         * array3[0] = new StringBuilder("ok"); - компилятор не пропустит потому, что у массива array3 тип данных это
         * массив типа String
         * 
         * array2[0] = new StringBuilder("ok"); - можно потому, что тип array2 это Object и компилятор пропустит, но 
         * run time определит, что на самом деле array2 ссылается на массив типа String, мы пытаемся изменить нулевой 
         * элемент массива на элемент StringBuilder, а он может содержать только String и поэтому выйдет exception

         */
                

    }
}
