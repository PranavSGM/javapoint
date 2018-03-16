package Interface;

/**
 * Created by pjai58 on 11/2/2017.
 */

//Since Java 8, we can have method body in interface. But we need to make it default method. Let's see an example:

interface Drawable2{
        //void draw();
        default void msg(){System.out.println("default method");}
        }

class Rectangle2 implements Drawable2{
    public void draw(){System.out.println("drawing Rectangle2");}
}

class TestInterfaceDefault{
    public static void main(String args[]){
        Rectangle2 d=new Rectangle2();
        d.draw();
        d.msg();
    }}  