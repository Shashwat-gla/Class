//hw if else  indian currency all notes eg 2436-10 516 -4
import java.util.Scanner;
public class Indiancurrency {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter currency ");
        int currency = sc.nextInt();
        int a =0;
        if(currency >= 500){
            int b = currency/500;
            System.out.println("500 "+b);
            currency %=500;
            a += b;
        }if (currency >= 200){
            int b = currency/200;
            System.out.println("200 "+b);
            currency %= 200;
            a += b;
        }if (currency >= 100){
            int b = currency/100;
            System.out.println("100 "+b);
            currency %=100;
            a += b;
        }if (currency >= 50){
            int b = currency/50;
            System.out.println("50 "+b);
            currency %= 50;
            a += b;
        }if (currency >=20){
            int b = currency/20;
            System.out.println("20 "+b);
            currency %= 20;
            a += b;
        }if(currency>=10){
            int b = currency/10;
            System.out.println("10 "+b);
            currency %=10;
            a += b;
            // included coins
        }if (currency >=5){
            int b = currency/5;
            System.out.println("5 "+b);
            currency %=5;
            a += b;
        }if(currency >=2){
            int b = currency/2;
            System.out.println("2 "+b);
            currency %=2;
            a += b;
        }if(currency >=1){
            int b = currency/1;
            System.out.println("1 "+b);
            currency %=1;
            a += b;
        }
        System.out.println("remaining "+ currency);
        System.out.println("total coins + notes "+ a);
    }
}
