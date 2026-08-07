import java.util.Scanner;
public class _2nd_Largest_Array {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        int x [] = {12,3,4,5,6,7,89};
        for(int i=0;i<x.length;i++){
            if (x[i]>largest){
                seclargest=largest;
                largest=x[i];
            }else if (x[i] > seclargest && x[i] !=largest){
                seclargest =x[i];
            }
        }
        System.out.println(seclargest);
    }
}
