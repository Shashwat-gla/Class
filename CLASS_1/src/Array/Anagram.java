package Array;
public class Anagram {
    public static void anagram(String a ,String b ){
        int [] frq = new int[26];
        if(a.length()!=b.length()){
            System.out.println("Not Anagram");
        }
        for(char ch :a.toCharArray()){
            frq[ch - 'a']++;
        }
        for(char ch :b.toCharArray()){
            frq[ch - 'a']--;
        }
        for(int x :frq){
            if( x!=0){
                System.out.println("Not Anagram");
            }
        }
        System.out.println("Anagram");
    }
    public static void main (String[] args){
        String a = "listen";
        String b = "silent";
        anagram(a,b);
    }
}
