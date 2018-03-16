package ObjectCloning;

/**
 * Created by pjai58 on 11/6/2017.
 */
public class Student implements Cloneable{

    int rollno;
    String name;

    Student( int rollno,String  name){
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Student s1 = new Student(101, "Rahul");
            Student s2 = (Student)s1.clone();
        }catch(CloneNotSupportedException c){System.out.println("catch exception");}
    }
}
