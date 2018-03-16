package SetterGetter;

/**
 * Created by pjai58 on 11/6/2017.
 */
public class Simple {
    private String name;

    public String getname(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class test{
    public static void main(String args[]){
        Simple s = new Simple();
        s.setName("rahul");
        System.out.println(s.getname());

    }
}