import java.util.Scanner;
public class linear_Search {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6};
        int key = 3;
        int index = -1 ;
        for (int i =0;i<=arr.length-1;i++){
            if(arr[i]==key){
                index =i;
                break;
            }
        }
        System.out.println("key found ," + " Index is " + index);
    }
}