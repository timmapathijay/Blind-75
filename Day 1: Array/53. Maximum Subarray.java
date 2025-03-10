class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm 
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
          sum += nums[i];
          maxSum = Math.max(maxSum , sum);
          sum = sum < 0 ? 0 : sum;
        } 
        
        return maxSum;
    }
}
// TC : O(N)
// SC : O(1)
