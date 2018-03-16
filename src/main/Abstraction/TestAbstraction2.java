package Abstraction;

/**
 * Created by pjai58 on 11/2/2017.
 */
//example of abstract class that have method body
abstract class Bike2{
    Bike2(){System.out.println("Bike2 is created");}
    abstract void run();
    //void run(){System.out.println("Bike run running ....");    }
    void changeGear(){System.out.println("gear changed");}
}

class Honda extends Bike2{
    int x =3;
    void run(){System.out.println("running safely..");}
    void abc (){System.out.println("running abc ... "); }

}
class TestAbstraction2{
    public static void main(String args[]){
        Bike2 obj = new Honda();

        obj.run();
        obj.changeGear();
    }
}  
