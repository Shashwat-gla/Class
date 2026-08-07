import java.util.Scanner;
public class _Sort_Array {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int x [] = {12,3,4,5,6,7,89};
        boolean flag=true;
        for (int i = 0;i<x.length-1;i++){
                if (x[i]>x[i+1]){
                    flag=false;
                    break ;
                }
        }
        System.out.println(flag);
    }
}
