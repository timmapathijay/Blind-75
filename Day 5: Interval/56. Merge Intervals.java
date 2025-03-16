class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> intervalsList = new ArrayList<>();
        Arrays.sort(intervals,(a , b) -> a[0] - b[0]);
        // As we have sorted the intervals, the overlapping intervals are bound to be consecutive.
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++)
        {
           if(intervals[i][0] <= end){
            end = Math.max(end , intervals[i][1]);
           }
           else{
            int[] tempInterval = {start , end};
            intervalsList.add(tempInterval);
            start = intervals[i][0];
            end = intervals[i][1];
           }
        }
        int[] tempInterval = {start , end};
        intervalsList.add(tempInterval);
        return intervalsList.toArray(new int[intervalsList.size()][]);
    }
}
// TC : N log(N) + N 
// SC : O(1)
