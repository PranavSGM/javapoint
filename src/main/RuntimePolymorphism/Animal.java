package RuntimePolymorphism;

/**
 * Created by pjai58 on 11/1/2017.
 */
class Animal{//multiple-inheritance  !!
    void eat(){System.out.println("eating");}
}
class Dog extends Animal{
    void eat(){System.out.println("eating fruits");}
}
class BabyDog extends Dog{
    //void eat(){System.out.println("drinking milk");}
    public static void main(String args[]){
        Animal a1,a2,a3;
        a1=new Animal();

        a2=new Dog();

        a3=new BabyDog();

        a1.eat();
        a3.eat();
        a2.eat();

    }
}
