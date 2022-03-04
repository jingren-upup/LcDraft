package Leetcode;


import java.util.ArrayList;
import java.util.List;

public class Lc_122_maxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++)
            profit += Math.max(0, prices[i] - prices[i - 1]);

        return profit;

    }
}
