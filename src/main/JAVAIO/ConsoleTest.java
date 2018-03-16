package JAVAIO;

import java.io.Console;

/**
 * Created by pjai58 on 11/10/2017.
 */

public class ConsoleTest {

    public static void main(String args[]){

        Console c = System.console();
        System.out.println("Enter your name : ");
        String name = c.readLine();
        System.out.println("name is : "+name);

    }
}
