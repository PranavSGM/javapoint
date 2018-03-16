package Interface;

/**
 * Created by pjai58 on 11/2/2017.
 */
interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){System.out.println("I am C");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

class AbstractImplementInterface{
    public static void main(String args[]){
        M a=new M();
        a.c();
        a.b();
        a.d();
        a.c();
    }}
