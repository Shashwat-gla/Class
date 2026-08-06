package Array;
import java.util.Arrays;
import java.util.Scanner;
public class _1D_Array {

    // Input

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of students ");
        int n = sc.nextInt();
        System.out.println(" find marks  ");
        int num = sc.nextInt();
        int marks []= new int[n];
        for (int i =0;i<n;i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("Marks of Students ");
        for (int i =0; i<n;i++){
            System.out.println(marks[i]);
        }

        //max marks

        int max = Integer.MIN_VALUE;
        for (int i =0; i<n;i++){
            if (marks [i]>max){
                max = marks [i];
            }
        }
        System.out.println("Maximum marks "+max);

        //min marks

        int min = Integer.MAX_VALUE;
        for (int i =0; i<n;i++){
            if (marks [i]<min){
                min = marks [i];
            }
        }
        System.out.println("Minimum marks "+min);

        //sum

        long  sum = 0;
        for (int i =0 ;i<n;i++){
                sum+=marks[i];
        }
        System.out.println("Total marks "+sum);

        //avg

        double avg = (double )sum/n;
        System.out.println("Average of marks "+avg);

        //sort

        Arrays.sort(marks);
        System.out.println(Arrays.toString((marks)));

        //search

//        int num = ;
        boolean search = false;
        for (int i =0 ;i<n;i++){
            if(marks[i]==num){
              search=true;
              break;
            }
        }
        if(search ) System.out.println("Num Found ");
        else System.out.println("Not Found");
    }
}
