import java.util.Arrays;

public class _String {
    public static void main (String[]args ){
        String name = new String ("Ram agarval");

        char chs [] ={'r', 'a', 'm'};

        String ch = new String(chs);
        System.out.println(ch);

        char arr [] =ch.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(name );

        String s1 = "abcd";
        String s2 = "abcd";

        if (s1.compareTo(s2) == 0 ){
            System.out.println("Same");
        }
        else System.out.println("Not same ");
    }
}