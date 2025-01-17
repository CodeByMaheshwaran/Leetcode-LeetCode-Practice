class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        //Sort by Ascending of Starting Point
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));
        List<int[]> result=new ArrayList<>();
        int[] newInterval=intervals[0];
        result.add(newInterval);
        for(int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
                //OverLapping Intervals
                //Update End if needed
                newInterval[1]=Math.max(newInterval[1],interval[1]);
            }else{
                //disjoint Intervals
                //add the new Interals to the List
                newInterval=interval;
                result.add(newInterval);
            }
        }
    return result.toArray(new int[result.size()][]);     
    }
}