package Binding;

import java.awt.*;

/**
 * Created by pjai58 on 11/2/2017.
 */
public class Animal {

    String color =" black";
    int age = 3;

   void eat(){System.out.println("Animal ..");}
    }


class horse extends Animal{
     int term = 3;

     void eat(){System.out.println("horse....");
     }

     public static void main(String[] args){
        Animal an = new horse();
           /* horse a = (horse)new Animal();
           System.out.println( a.term);
           System.out.println(a instanceof Animal);
         System.out.println(a instanceof horse);*/

         an.eat();
       System.out.println(an instanceof Animal);
System.out.println(an instanceof horse);

     }
}