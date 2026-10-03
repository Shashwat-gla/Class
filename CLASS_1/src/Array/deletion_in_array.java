package Array;
import java.util.Scanner;
 class deletion_in_array {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int []arr = {10 ,20, 30, 40, 50 };
        int n = 5;
        int p =4;
        for(int i =p;i<p;i++){
            arr[i]= arr[i+1];
        }
        n--;
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
