public class Move_zeros_to_end {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        int first = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[first] = arr[i];
                first++;
            }
        }
        while (first < arr.length) {
            arr[first] = 0;
            first++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}