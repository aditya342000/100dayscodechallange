//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
class Solution {
  public int maxProfit(int[] prices) {
      int min = 1000000;
      int profit = 0;
      int n = prices.length;
      for(int i=0; i<n; i++){
          min = Math.min(min, prices[i]);
          profit = Math.max(profit, prices[i] - min);
      }
      return profit;
   }
}

  
