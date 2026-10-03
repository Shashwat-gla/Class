package Array;

import java.util.Arrays;

public class binary_search {
    public static  void  binarysearch(int [] arr,int target ){
        int n = arr.length;
        Arrays.sort(arr);
        int r=n-1;
        int l =0;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target){
                System.out.print(mid);
                return ;
            }else if (arr[mid]<target){
                l =mid+1;
            }else{
                r=mid-1;
            }

        }
        System.out.println("not found ");
    }
    public static void main(String [] args){
        int []arr ={2,3,1,4,5,6,7,8,9};
        int target = 1;
        binarysearch(arr,target);
    }
}
