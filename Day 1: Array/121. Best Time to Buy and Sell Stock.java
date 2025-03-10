class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyCost = prices[0];
        for(int i = 1 ; i < prices.length ; i++)
        {
            maxProfit = Math.max(maxProfit , prices[i] - buyCost);
            buyCost = Math.min(buyCost , prices[i]);
        }
        return maxProfit;
    }
}
// TC : O(N)
// SC : O(1)
