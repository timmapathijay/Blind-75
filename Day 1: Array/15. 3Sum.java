class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // N log N
        long sum;
        for(int i = 0; i < n - 2; i++)
        {
            if(i != 0 && nums[i] == nums[i - 1])
            continue;
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum < 0)
                j += 1;
                else if(sum > 0)
                k -= 1;
                else
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);
                    j += 1;
                    k -= 1;
                    while(j < k && nums[j] == nums[j - 1]){
                        j += 1;
                    }
                    while(j < k && nums[k] == nums[k + 1]){
                        k -= 1;
                    }
                }
            }
        }
        return ans;
    }
}
// TC : N log N [Sorting] + N^2 => O(N^2)
// SC : O(1)
