package lesson22_encapsulation_super_protected;

/* public class Hummen {

   final String gender;

    Hummen(String gender) {
        this.gender = gender;
    }

    String name;
    int age;
    int weight;

    public static void main(String[] args) {
        Hummen h = new Hummen("male");
        h.age = 25;
        h.name = "Иван";
        h.weight = 70;

    }
 так можно имя сделать 2500, возраст -70. чтобыэтого избежать, применим к классу Hummen инкапсуляцию

} */
public class Hummen {

    final String gender;

    Hummen(String gender) {
        this.gender = gender;
    }

    private String name;

    /**
     * чтобы мы могли что-то делать с переменной name, мы должны создать public методы, которые позваляют видеть эту переменную, обычно они назыывются называется с префиксом get
     */
    public String getName() {
        return name;
    }

    /**
     * И метод который будет позволять нам назначать какое-то имя если мы захотим его изменить обычно они назыывются называются с префиксом set
     */
    public void setName(String s) {
        name = s;
    }
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        /**
         * Мы будем позволять менять возраст в определенных условиях:
         */

        if (i > 0) {
            age = i;
        }

    }
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int i) {
        if (i > 0) {
            weight = i;
        }

    }
}
    /**
     * теперь на мы можем изменять поля класса, но не на прямую, а с помощью метода.
     * Так же это можно сделать из другого пакета
     * 
     * иногда вместо get если мы используем boolean переменную, в префиксе пишут is:
     *  private boolean clever; 
     *  public boolean isClever(){ 
     *      return clever;
     *  }
     * с методом set изменений никаких нет
     * 
     */
    class Test {

        public static void main(String[] args) {
            Hummen h1 = new Hummen("male");
            h1.setName("Николай");
            h1.setAge(30);
            h1.setWeight(40);

            System.out.println(h1.getName()); // Николай
            System.out.println(h1.getAge()); // 30
            System.out.println(h1.getWeight()); // 40

        }

    }

