package Collection;

import java.io.IOException;
import java.util.*;

/**
 * Created by pjai58 on 11/21/2017.

 Java ArrayList class can contain duplicate elements.

 Java ArrayList class maintains insertion order.

 Java ArrayList class is non synchronized.

 Java ArrayList allows random access because array works at the index basis.

 In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.

 */

class book {
    int id,quantity;
    String name,author, publisher;

    public book(int id, String name, String author, String publisher, int quantity){
        this.id = id;
        this.quantity = quantity;
        this.name = name;
        this.author = author;
        this.publisher = publisher;

    }
}

class student {

    int id, marks;
    String name, school;

    public student( int id, String name, int marks, String school){
        this.id = id;
        this.name = name;
        this.marks= marks;
        this.school = school;
    }

}




public class ArrayListExample {

    public static List<book> list = new ArrayList<book> ();
    public static List<book> list2 = new ArrayList<book> ();

    public static void main(String args[]){

        System.out.println(" Starting the application !");
        runApp();

        }


    static void runApp(){
        int inchar ;
        int find ;
        System.out.println("Available Tasks are:-" +
                        "\n0)Exit the program " +
                "\n1)ExampleBook" +
                "\n2)ExampleItr" +
                        "\n3)studentItr"
                );

        System.out.println("Enter your Choice");
        try {
            Scanner scanner = new Scanner(System.in);
            inchar = scanner.nextInt();
            /*Double a = Double.parseDouble(scanner.nextLine());
            Long x = Long.parseLong(scanner.nextLine());*/
            String g = scanner.nextLine();
            System.out.println("value of g is : "+ g);

            System.out.printf( "%10s%10d%10c%10f\n\n", "hello", 7, 'a', 1.23 );
            System.out.printf( "%-10s%-10d%-10c%-10f\n", "hello", 7, 'a', 1.23 );

               // inchar = System.in.read();
            System.out.println("YOu entered : " + inchar);
        } catch (Exception e) {
            System.out.println("Error reading from User !: "+ e );
        }

        System.out.printf( "%-15s%03d%n", "hello" , 67);

        switch (inchar = 0) {

            case 0:
                System.out.println("Exiting all tasks !");
            break;


            case 1:
                System.out.println("Starting Task : 1 \nTask is -> To implement all basic functions of ArrayList Class.");
                ExampleBook();
                break;

            case 2:
                System.out.println("Starting Task : 2 \nTask is -> To Iterate the ArrayList using Iterator.");
                ExampleItr();
                break;

            case 3:
                System.out.println("Starting Task : 3 \nTask is ->Student Itr.");
                StudentItr();
                break;
            default:
                System.out.println("No valid task is chosen to start ! Please Try Again ");

        }
        if (inchar != 0)
        runApp();
        if (inchar <2 & inchar >5){}

    }

    static void ExampleBook(){
        book b1 = new book(1,"abc","raam","sun",22);
        book b2 = new book(2,"abc2","raam2","sun2",24);
        book b3 = new book(3,"abc","raam","sun",22);

        //List <book> list = new ArrayList <book>();

        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println(list.size());
        list.add(3,b2);
        list.add(4,b3);
        list.addAll(1,list);
        System.out.println("Last index of b2 =>"+list.lastIndexOf(b2));
        System.out.println("First index of b2 =>"+list.indexOf(b2));
        list.add(b1);
        list2 = list;

        System.out.println("object at index 4 is -> "+list2.get(4).id + " "+ list2.get(4).author);

        System.out.println(list2.size());
        System.out.println("printing the ArrayList");
        for (book obj:list2){
            System.out.println(obj.id+" "+obj.name+" "+obj.author+" "+obj.publisher+" "+obj.quantity);
        }

    }

 static void ExampleItr(){

        List <String> list = new ArrayList<String> ();
        list.add("amdocs");
     list.add("accenture");
     list.add("dell");

     Iterator itr = list.iterator();

     while(itr.hasNext()){

         System.out.println(itr.next());
     }
 }

 static void StudentItr(){

     student s1 = new student(1,"rahul",99,"sms");
     student s2 = new student(2, "rohan", 66,"dav");
     student s3 = new student(3,"gupta",88,"ryan");

     List<student> list = new ArrayList<student>();

     list.add(s1);
     list.add(s2);
     list.add(s3);

     Iterator itr = list.iterator();

     while(itr.hasNext()){
         student st = (student)itr.next();
         System.out.println(st.id +" "+st.marks+" "+ st.name+" "+st.school);
     }


 }
}
