class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> intervalsList = new ArrayList<>();
        int i = 0;
        while(i < n && intervals[i][1] < newInterval[0])
        {
            intervalsList.add(intervals[i]);
            i += 1;
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
          newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
          newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
          i += 1;
        }
        intervalsList.add(newInterval);
        while(i < n){
            intervalsList.add(intervals[i]);
            i += 1;
        }
        return intervalsList.toArray(new int[intervalsList.size()][]);
    }
}
// TC : O(N)
// SC : O(1)
