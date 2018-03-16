package String;



import java.util.StringTokenizer;

/**
 * Created by pjai58 on 11/6/2017.
 */
public class equals {

    public static String capitalizeWord(String str){
        String words[]=str.split(" ");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }
        return capitalizeWord.trim() ;
    }
    public static void main(String args[]){
        String s1 = "abc";
        String s2 = "def";
        String s3 = "ABC";

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        String s4 = s2.intern();
        System.out.println(s4);

        StringBuffer sb = new StringBuffer(20);
        System.out.println(sb.capacity());
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
        sb.ensureCapacity(19);
        System.out.println(sb.capacity());

        StringTokenizer st = new StringTokenizer("My name", " ");
        while(st.hasMoreTokens())
            System.out.println(st.nextToken(" "));



        System.out.println(equals.capitalizeWord("my name is khan"));
        System.out.println(equals.capitalizeWord("jav is famous language"));
    }
}
