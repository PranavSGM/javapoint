package Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pjai58 on 11/23/2017.
 * Java LinkedList class uses doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

 The important points about Java LinkedList are:

 Java LinkedList class can contain duplicate elements.
 Java LinkedList class maintains insertion order.
 Java LinkedList class is non synchronized.
 In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
 Java LinkedList class can be used as list, stack or queue.
 */


public class LinkedListExample {

public static void main(String args[]){

    List<String> list = new LinkedList<String>();
    list.add("ddabc");
    list.add("def");
    list.add("www");
    System.out.println(list.indexOf("ddabc"));


   /* for(String obj:list){

        System.out.println(obj);
    }*/


}


   /* static void runApp(){
        int inchar = 0;
        System.out.println("Available Tasks are " +
                "\n1)ExampleBook" +
                "\n2)ExampleItr" +
                "\n2)studentItr"
        );

        System.out.println("Enter your Choice");
        try {
            Scanner scanner = new Scanner(System.in);
            inchar  = scanner.nextInt();
            // inchar = System.in.read();
            System.out.println("YOu entered : " + inchar);
        } catch (Exception e) {
            System.out.println("Error reading from User !");
        }

        switch (inchar) {

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
                System.out.println("No valid task is chosen to start ! Please Try Again ");runApp();

        }
    }
*/


}
