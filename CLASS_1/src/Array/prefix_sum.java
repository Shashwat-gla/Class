package Array;
public class prefix_sum {
    public static void prefixsum(int []arr){
        for(int i =1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String []args){
        int[] arr= {1,2,3,4,5,6,8};
        prefixsum(arr);
    }
}
