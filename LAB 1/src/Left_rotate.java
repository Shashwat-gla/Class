import java.util.Scanner;
public class Left_rotate {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int arr [] = {1,2,3,4,5,6,7,8};
        int first = arr[0] ;
        for(int i = 0 ; i<arr.length -1 ;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = first ;
        
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
