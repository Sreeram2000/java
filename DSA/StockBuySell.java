/*

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/

public class StockBuySell {
    class Solution {
        /*    
        
        1>Initialize two variables max_profit and min_price.
        2>if current price is less than min_price update min_price.
        3>else if current price - min_price > max_profit update max_profit.
        4> This method ensures uni-directional tarversal as in does'nt allow selling before buying.  
        
        */
            public int maxProfit(int[] prices) {
                int max_profit = 0,min_price = Integer.MAX_VALUE;
                for(int i=0;i<prices.length;i++)
                {
                    if(prices[i] < min_price)
                    {
                        min_price = prices[i];
                    }
                    else if(prices[i] - min_price > max_profit)
                    {
                        max_profit = prices[i] - min_price;
                    }
                }
                return max_profit;
            }
        } 
}
