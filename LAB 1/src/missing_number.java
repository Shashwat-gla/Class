import java.util.Scanner;
public class missing_number {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in );
        int [] num= {1,3,4,5,6,7,8};
        int n = num.length+1;
        int expectedsum = n*(n+1)/2;
        int actualsum = 0;
        for(int i =0;i< num.length;i++){
            actualsum+=num[i];
        }
        int miss = expectedsum-actualsum;
        System.out.println(miss);
    }
}