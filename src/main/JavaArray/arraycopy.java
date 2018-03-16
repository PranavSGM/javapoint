package JavaArray;

/**
 * Created by pjai58 on 11/6/2017.
 */
class arraycopy {

    public static void main(String args[]){
        char copyFrom[] = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char copyTo[] = new char[8];

        System.arraycopy(copyFrom, 5, copyTo, 0,  8);
        System.out.println(copyTo);
    }
}
