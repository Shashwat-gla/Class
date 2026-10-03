package Array;
import java.sql.SQLOutput;
public class sliding_window {
    public static void maxsum(int [] arr ){
        int k =3; // 3 size ka window
        int sum =0;
        int n = arr.length;
        for(int i =0;i<k;i++){
            sum+=arr[i];
        }
        int ms = sum ;  //ms=maxsum
        for(int i=k;i<n;i++){    //window ko slide karna
            sum+=arr[i];
            sum-=arr[i-k];
            ms=Math.max(sum,ms);
        }

        System.out.println(ms);
    }
    public static void main(String[] args){
        int [] arr = {3,4,5,6,7,8,9,0};
        maxsum(arr);
    }
}
