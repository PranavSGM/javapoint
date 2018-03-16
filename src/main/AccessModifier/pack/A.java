package AccessModifier.pack;

/**
 * Created by pjai58 on 11/3/2017.
 */
/*public class A {

    protected int a=10;
    protected void msg(){System.out.println("Hello");}

}*/
public class A{
   /* protected*/ public void msg(){System.out.println("Hello java");}
}

class Simple extends A{
    public void msg(){System.out.println("Hello java");}//C.T.Error
    public static void main(String args[]){
        Simple obj=new Simple();
        obj.msg();
    }
}

