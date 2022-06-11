package lesson26_equals_and_toString_wrapper_classes;

public class Initializer_example_5 {
    public static void main(String[] args) {
          
          Lion l = new Lion();
    }
  
}

class Animal {

    Animal() {
        System.out.println("Constructor of Animal");
    }

    static {
        System.out.println("Static int in Animal");
    }

    {
        System.out.println("Non static int in Animal");
    }
}

    class Mammal extends Animal {

        Mammal() {
            System.out.println("Constructor of Mammal");
        }

        static {
            System.out.println("Static int in Mammal");
        }

        {
            System.out.println("Non static int in Mammal");
        }

    }
    
    class Lion extends Mammal {

        Lion() {
            System.out.println("Constructor of Lion");
        }

        static {
            System.out.println("Static int in Lion");
        }

        {
            System.out.println("Non static int in Lion");
        }

    }

/**
 * output:
 *         Static int in Animal
           Static int in Mammal
           Static int in Lion
           Non static int in Animal
           Constructor of Animal
           Non static int in Mammal
           Constructor of Mammal
           Non static int in Lion
           Constructor of Lion
 */


