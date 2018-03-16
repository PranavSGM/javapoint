package WrapperClass;

//import static java.lang.Integer.valueOf;

/**
 * Created by pjai58 on 11/6/2017.
 */
public class WrapperExample1 {

    public static void main(String args[]){
        int a = 30;
         Integer i = a;
       /* Integer ij=Integer.valueOf(a);*/
         System.out.println(a+"   "+ i);

         Integer b = new Integer(20);
         int j = b;
         int ji = b.intValue();
        System.out.println(b+ "   "+ j + "  "+ ji);

        for(int k=0;k<args.length;k++)
            System.out.println("List of args =>" +args[i]);

    }
}
