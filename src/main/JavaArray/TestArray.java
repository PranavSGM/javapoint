package JavaArray;

/**
 * Created by pjai58 on 11/6/2017.
 */
public class TestArray {
    public static void main(String args[]) {

        int a[] = new int[2];

        int arr[][] = {{0,0,2},{0,1,3},{1,2,3}};
System.out.println(arr.length);
        for (int i =0; i<3; i++){
            for (int j =0; j<3  ; j++){

                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        Class c = arr.getClass();
        System.out.println(c.getName());

    }
}