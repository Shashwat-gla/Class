package Array;
public class linear_search {
    public static void linearsearch(int [] arr ,int target){
        int n = arr.length;
        for(int i =0;i<n;i++) {
            if (arr[i] == target) {
                System.out.print("Index found "+ i);
                return ;
            }
           }
        System.out.println("not found ");
        }
    public static void main (String []args){
        int arr [] = {1,3,2,4,5,6,8,9};
        int target = 3;
        linearsearch(arr,target);
    }
}
