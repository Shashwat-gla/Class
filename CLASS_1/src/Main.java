import java.util.Scanner;
//hello world
class Nameage {
    public static void main(String[]args){
        // scanner class object
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(name+age);
    }
}
//sc.nextLne(); flaw