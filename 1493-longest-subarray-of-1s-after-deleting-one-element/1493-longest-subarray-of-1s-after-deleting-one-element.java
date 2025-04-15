class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,maxCount=0,zeros=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeros+=1;
            }
            while(zeros > 1){
                if(nums[left]==0){
                    zeros-=1;
                }
                left++;
            }
            maxCount=Math.max(maxCount,right-left);
             //window size calculation=right-left+1; 
        }    //remove 1 element so minus 1 ==>right-left+1-1 one and  one cancel  so right-left;
    return maxCount;
    }
}