package Overriding_Hiding_Final;

public class Return_null {

    /**
     * какой бы return type небыл (reference естественно) мы можем вернуть null null это частный лучай любого объекта? это отсутствие объекта:
     */
    String abc() {
        return null;
    }

    /**
     * В return ststemen-те мы можем сами указать любое значение которое само может конвертироваться в данный return type
     */
    int abc2() {
        char c = 'h';
        return c; 
    /**
     * с может сам конвертироваться в int потому что в основе char лежит int
     */    
    }
}
