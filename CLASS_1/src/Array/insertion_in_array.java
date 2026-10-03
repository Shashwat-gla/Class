package Array;
import java.util.Scanner;
class insertion_in_array {
    public static void main (String []args){
//    Scanner sc = new Scanner(System.in);
        int [] arr= {10 , 20 , 30 , 50 ,0};
        int n = 4;
        int p= 3;  // position
        int v =40;  //value
        for(int i =n;i>p ;i--){
            arr[i]=arr[i-1];
        }
        arr[p]=v;
        n++;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}