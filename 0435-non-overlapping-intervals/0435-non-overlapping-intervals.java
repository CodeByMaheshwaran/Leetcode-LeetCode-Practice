class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       int n=intervals.length; 
       if(n==0) return 0;
       //Sort the intervals based on the end time
       Arrays.sort(intervals, Comparator.comparingInt(a->a[1]));
       int count=1; //we need to have atleast one interval (without overlapping)
       int previous_interval=0; // zero based index it represents first interval
       for(int i=1;i<n;i++){
        //check start time of the next interval is greater than or equal to 
        //the end time of the current interval, then we can keep it
        if(intervals[i][0]>=intervals[previous_interval][1]){
            previous_interval=i;
            count++;
        }
       }
    // Return the number of interval to remove (minimum)
    return n-count;   
    }
}