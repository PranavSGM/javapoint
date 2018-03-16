package main.Polymorphism;

import static java.lang.System.out;

/**
 * Created by pjai58 on 11/1/2017.
 */
public class Task1 {
    int r =2;

   void area(int r){
        System.out.println("SuperClass Area accessed");


    }

}

class Task2 extends Task1{
    int l = 20;

    void area(int l){
        System.out.println("SubClass Area accessed");

    }

}

class test {
    public static void main (String[] args){

        Task1 obj1 = new Task1();

        Task2 obj2 = new Task2();

        obj1.area(obj2.r);
        obj2.area(obj2.l);

    }
}
