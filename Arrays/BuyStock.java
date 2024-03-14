import java.util.*;

public class BuyStock {
    static int maxProfit(int prices[])
    {
        int n = prices.length;
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {
 
            // Checking for lower buy value
            if (buy > prices[i])
                buy = prices[i];
 
            // Checking for higher profit
            else if (prices[i] - buy > max_profit)
                max_profit = prices[i] - buy;
        }
        return max_profit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the elements of arrays");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        sc.close();

        int max_profit = maxProfit(prices);
        System.out.println(max_profit);
    }

    
}
