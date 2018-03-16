package Abstraction;

/**
 * Created by pjai58 on 11/2/2017.
 */
abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle");}
}
class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}
//In real scenario, method is called by programmer or user
public class TestAbstraction1{
    public static void main(String args[]){
        Shape s=new Circle1();//In real scenario, object is provided through method e.g. getShape() method
        s.draw();
        Shape r= new Rectangle();
        
       System.out.println( s.getClass());
    }
}