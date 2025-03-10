class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            ans[i] = ans[i - 1] * nums[i];
        }
        int suffixProduct = 1;
        for(int i = n - 1 ; i > 0 ; i--){
            ans[i] = ans[i - 1] * suffixProduct;
            suffixProduct *= nums[i]; 
        }
        ans[0] = suffixProduct;
        return ans;
    }
}
// TC : N[Prefix Product] + N => O(2N)
// SC : O(1)
