package Array;
import java.util.Scanner;
public class Recurssion {

    public static void fun  (int n){
        if(n==0)return;
        fun(n-1);
        System.out.print(n+" ");
       // base case
//     if(i>n)return;

//     System.out.print(i+" ");
//         fun(n,i+1);

        // base case
//        if(i>n)return;

//        fun(n,i+1);
//        System.out.print(i+" ");

    }
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n =6;
        //int n = sc.nextInt();
//        for(int i =0;i<=n;i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();
        fun(n);
    }
}

