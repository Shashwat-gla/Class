import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        int unit = sc.nextInt();
        int charge = 0;
        if (unit <= 100) {
            charge = unit * 10;
        }
        else if (unit <= 200) {
            charge = (100 * 10) + (unit - 100) * 15;
        }
        else if (unit <= 300) {
            charge = (100 * 10) + (100 * 15) + (unit - 200) * 20;
        }
        else {
            charge = (100 * 10) + (100 * 15) + (100 * 20) + (unit - 300) * 25;
        }
        System.out.println("Electricity Bill = " + charge);
//        int a = 105+012;
//        System.out.println(a);

    }
}

// git hub
