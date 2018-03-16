package InstanceBlock;

/**
 * Created by pjai58 on 11/1/2017.
 */


class Bike7{
    int speed;

    Bike7(){System.out.println("Super speed is "+speed);
    System.out.println("Super Constructor");
    }

    {System.out.println("entered the Super instance Initializer Block !");
        speed=100;}


}

class Bike2 extends Bike7{
 Bike2(){
     System.out.println("sub speed"+ speed);
     System.out.println("Sub Constructor");
 }

    {System.out.println("entered the sub instance Initializer Block !");
        speed=50;}

    public static void main(String args[]){
        Bike2 b1=new Bike2();
        Bike7 b2=new Bike2();
    }
}