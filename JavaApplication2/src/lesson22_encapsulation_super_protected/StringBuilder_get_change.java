package lesson22_encapsulation_super_protected;

public class StringBuilder_get_change {

}

/**
 * class Hummen {
 *
 * private StringBuilder name;
 *
 * public StringBuilder getName() { return name; }
 *
 * public void setName(StringBuilder s) { name = s; }
 *
 * }
 *
 * class Test {
 *
 * public static void main(String[] args) { Hummen h1 = new Hummen(); h1.setName(new StringBuilder("Николай")); System.out.println(h1.getName());// Николай мы изменили имя через метод get ,
 * это очень не хорошая ошибка. мы не должны это мочь потому что с помощью get мы должны только получать или приравнивать его, но не менять System.out.println(h1.getName()); Николай!!!
 *
 * }
 * }
 *
 * чтобы этого избежать, перепишем код:
 */
class Hummen {

    private StringBuilder name;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb; // здесь мы возвращаем копию, а с копией можно делать все что угодно
    }

    public void setName(StringBuilder s) {
        name = s;
    }

}

class Test {

    public static void main(String[] args) {
        Hummen h1 = new Hummen();
        h1.setName(new StringBuilder("Николай"));
        System.out.println(h1.getName()); // Николай
        h1.getName().append("!!"); // т.е. с копией мы можем делать все, что угодно, но на само имя это не отразится
        System.out.println(h1.getName()); // Николай - ничего не изменилось

    }
}
/**
 * Поэтому если return type метода get - это mutable(изменяемый) тип данных, то лучше возвращать его копию
 */
  