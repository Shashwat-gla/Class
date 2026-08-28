import java.util.Scanner;

public class missing_number {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in );
        int [] num= {2,3,4,5,7,8};
        int n = num.length;
        int expectedsum = n*(n+1)/2;
        int actualsum = 0;
        for(int i =0;i< num.length;i++){
            actualsum+=num[i];
        }
        int miss = expectedsum-actualsum;
        System.out.println(miss);
    }
}
// import java.util.Scanner;
//
//public class missing_number {
//    public static void main(String[]args) {
//        Scanner sc = new Scanner (System.in );
//        int [] num= {2,3,4,5,7,8};
//        for(int i =0;i< num.length;i++){
//            int n =0;
//            n =num[i];
//        }
//        int expectedsum = n*(n+1)/2;
//        int actualsum = 0;
//        for(int i =0;i< num.length;i++){
//            actualsum+=num[i];
//        }
//        int miss = expectedsum-actualsum;
//        System.out.println(miss);
//    }
//}