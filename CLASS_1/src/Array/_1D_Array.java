package Array;
import java.util.Arrays;
import java.util.Scanner;
public class _1D_Array {
    // Input
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students ");
        int n = sc.nextInt();
        // array lena
//        int marks []={70,100,80,60};
        int marks []= new int[n];
        for (int i =0;i<n;i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("Marks of Students ");
        for (int i =0; i<n;i++){
            System.out.println(marks[i]);
        }
//        marks[0]= 50 ;
//        marks[1]= 100 ;
//        marks[2]= 80 ;
//        marks[4]= 60 ;
//        marks[3]= 40 ;
        // agar galat hai toh update
//        marks[0]= 70 ;
        //
//        float marks [] = new float[n];
        System.out.println(Arrays.toString(marks));
    }
}
