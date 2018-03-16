package Interface;

/**
 * Created by pjai58 on 11/2/2017.
 */

// Multiple Inheritance


interface Printable{
    void print();
}

interface Showable{
    void show();
}

public class A7 implements Printable,Showable{ // whats the diff??????
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        Printable obj = new A7();
        obj.print();
        //obj.show();
    }

}
