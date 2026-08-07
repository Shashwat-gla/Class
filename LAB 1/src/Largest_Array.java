import java.util.Scanner;
public class Largest_Array {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr []= {12,3,4,5,6,7,89};
        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
