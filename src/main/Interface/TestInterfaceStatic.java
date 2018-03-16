package Interface;

/**
 * Created by pjai58 on 11/2/2017.
 */
interface Drawable3{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle3 implements Drawable3{
    public void draw(){System.out.println("drawing Rectangle3");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        Drawable3 d=new Rectangle3();
        d.draw();
        System.out.println(Drawable3.cube(3));
    }} 
