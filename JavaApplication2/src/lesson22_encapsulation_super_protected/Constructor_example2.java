package lesson22_encapsulation_super_protected;

public class Constructor_example2 {
    
}

    class Hummen5 {

        Hummen5(String name, String surname) { // (3)
            this.name = name;
            this.surmame = surname;
        }
        String name;
        String surmame;
    }

    class Student5 extends Hummen5 {
        int course;
        Student5(String name, String surname, int course){ // (1)
        super(name,surname);// (2)(4)
        this.course = course; // здесь обращене не к оверлодет конструктору а к перменной поэтому super и this вместе
        }
        
        public static void main(String[] args) {
            Student5 s5 = new Student5("Николай", "Иванов", 3);// 
            System.out.println(s5.course);
        }
    }

    /**
     * (1) при создании объекта вызывается конструктор с тремя параметрами
     * (2)Далее вызывается super конструктор с двумя параметрами
     * (3) На первой строке он обращается к конструктору класса Object, тот ниего не делает и возвращает управление
     * к этому конструктору. этот констуктор присваивает значения переменным.
     * (4) возвращает управление сюда и переменной course тоже назначается значение
     */


    
