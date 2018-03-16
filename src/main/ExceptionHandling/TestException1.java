package ExceptionHandling;

/**
 * Created by pjai58 on 11/9/2017.
 */
import java.io.*;
class Parent{
    void msg()throws Exception{System.out.println("parent");
    throw new ArithmeticException("Exception thrown in super !");
    }
}

class TestException1 extends Parent{
    void msg(){System.out.println("child");
        throw new ArithmeticException("Exception thrown in sub !");
    }

    public static void main(String args[]){
        Parent p=new TestException1();
        try{
            p.msg();
        }catch(Exception e){System.out.println("Exception caught for=>"+e);}
    }
}  
