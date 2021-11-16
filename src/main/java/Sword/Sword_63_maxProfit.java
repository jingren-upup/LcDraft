package Sword;

public class Sword_63_maxProfit {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int i:prices) {
          cost = Math.min(i,cost);
          profit = Math.max(profit,i-cost);
        }
        return profit;
    }
}
