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

//        if (s1.compareTo(s2) == 0 ){
//            System.out.println("Same");
//        }
//        else System.out.println("Not same ");

        System.out.println(s1.equals(s2));
        String s6 = "ABCD";
        String s7 = "abcd";

        System.out.println(s7.equalsIgnoreCase(s6));
        String s8 = "HELLO WORLD";
        String s9 = "hELLO";

        System.out.println(s8.startsWith(s9));
        String s10 = "World";
        System.out.println(s8.endsWith(s10));
        String s11 = "ello";

        System.out.println(s8.contains(s11));


        String s12 = "  hello ";
        System.out.println(s12.trim());


        String s13 = "abcdeaaa";
        s13 = s13.replaceFirst("a", "Z");
        System.out.println(s13);
        System.out.println(s13.replace('a','z'));

        String s14 = "abcd";
        System.out.println(s14.length());
        System.out.println(arr.length);
        for(int i =0;i<s14.length();i++){

            char c2 = s14.charAt(i);
            System.out.println(c2);
        }


        System.out.println(s14.substring(1,3));
    }
}