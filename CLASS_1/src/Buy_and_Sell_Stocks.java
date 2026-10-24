import java.util.Scanner;

public class Buy_and_Sell_Stocks {
    public static int profit (int [] prices){
        int bp = Integer.MAX_VALUE;
        int maxp = 0;
        int n = prices.length;
        for (int i =0;i<n ;i++){
            if(bp<prices[i]){
                int profit = prices[i]-bp;
                maxp =Math.max(maxp,profit);
            }else{
                bp =prices[i];
            }
        }
        return maxp;

    }

    public static void  main (String [] args) {
        int [] prices = {3,6,7,8,9};
        System.out.println(profit(prices));
    }
}
