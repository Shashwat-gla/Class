package Array;

public class Trapping_Rainwater {
    // trapped water = (water level - bar height )
    // left max , right max
    public static void trapingrainwater(int []arr){
        // arr = height
        int n = arr.length;
        int leftmax[]  = new int [n];
        leftmax[0]=arr[0];
        // left max boundry
        for(int i =1 ; i<n;i++){
            leftmax[i]=Math.max(arr[i],leftmax[i-1]);
        }
        // right max boundry
        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for (int i =n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        // loop
        //waterlvl= min(leftmax,rightmax)
        //trappedwater = waterlvl -height
        int waterlvl =0;
        int trappedwater =0;
        for(int i =0;i<n;i++){
            waterlvl=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlvl-arr[i];
        }
        System.out.println("Trapped water "+trappedwater);
        System.out.println("Water level "+waterlvl);
    }
    public static void main (String [] args){
//        int [] arr = {5,6,5,3,4,7,9,5,6,7};
        int arr[] = {4,2,0,6,3,2,5};
        trapingrainwater(arr);
    }
}
