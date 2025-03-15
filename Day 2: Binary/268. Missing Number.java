class Solution {
    public int missingNumber(int[] nums) {
        int xor_nums = 0;
        int xor_0toN = 0;
        for(int i = 0; i < nums.length; i++){
            xor_nums ^= nums[i];
            xor_0toN ^= (i + 1); 
        }
        return xor_nums ^ xor_0toN;
    }
}
// TC : O(N)
// SC : O(1)
