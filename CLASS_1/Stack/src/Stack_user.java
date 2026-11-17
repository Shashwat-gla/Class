import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack_user {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        int size = sc .nextInt();
        Stack s= new Stack(size);
        //System.out.println(s.top());
        System.out.println(s.size());
        //System.out.println(Arrays.toString(s.arr));
        //System.out.println(a.isEmpty());
        //System.out.println(s.isFull());
    }
}