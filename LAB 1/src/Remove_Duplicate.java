import java.util.Arrays;
import java.util.Scanner;
class duplicate {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,3,4,5};
        Arrays.sort(arr);
        int temp=0;
        for(int i =0;i<arr.length;i++){
            if(arr[temp]!=arr[i]){
                temp++;
                arr[temp]=arr[i];
                }
            }
            for (int i =0;i<=temp;i++){
                System.out.print(arr[i]);
            }
        }
    }
