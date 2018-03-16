package AccessModifier.mypack;

import AccessModifier.pack.A;

/**
 * Created by pjai58 on 11/3/2017.
 */

public class B extends A {

    public static void main(String args[]){
        B obj = new B();
        obj.msg();
        //System.out.println(obj.a);
    }
}
