import java.util.Arrays;
import java.util.Scanner;
public class Union {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 3, 4, 5};
        int[] b = {1, 7, 8, 9, 0};
        Arrays.sort(a);
        Arrays.sort(b);
        // Print first array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        // Check second array
        for (int i = 0; i < b.length; i++) {
            boolean found = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(b[i] + " ");
            }
        }
    }
}