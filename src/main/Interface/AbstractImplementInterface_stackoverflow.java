package Interface;

/**
 * Created by pjai58 on 11/3/2017.
 */

    interface Walk {
        String walk();
    }

    abstract class Animal5 implements Walk {
        abstract String MakeNoise();
    }

class Cat extends Animal5 {
    String MakeNoise() {
        return "Meow";
    }

    @Override
   public  String walk() {
        return "cat is walking";
    }
}

class Dog extends Animal5 {
    @Override
    public String walk() {
        return "Dog is walking";
    }

    @Override
    String MakeNoise() {
        return "bark";
    }
}

class Human {
    public void Speak() {
        System.out.println("...Speaking...");
    }
}

class AbstractImplementInterface_stackoverflow {
    public static void main(String[] args) {
       // Random randomGen = new Random();

        Animal5[] zoo = new Animal5[4];
        zoo[0] = new Cat();
        zoo[1] = new Dog();
        zoo[2] = new Cat();
        zoo[3] = new Cat();
        // System.out.println(zoo[ randomGen.nextInt(2)].MakeNoise());
        for (Animal5 animal : zoo) {
            if (animal instanceof Cat) {
                Cat jeffrey = (Cat) animal;
                System.out.println(jeffrey.MakeNoise());
            }

        }
    }
}

