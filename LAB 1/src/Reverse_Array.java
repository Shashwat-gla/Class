import java.util.Scanner;
public class Reverse_Array {
    public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5, 6};
        int s = 0;
        int e = arr.length - 1;
        int rev = 0;
        while (s < e) {
            rev = arr[s];
            arr[s] = arr[e];
            arr[e] = rev;
            s++;
            e--;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}