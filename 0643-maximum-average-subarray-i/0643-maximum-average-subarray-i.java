class Solution {
    public double findMaxAverage(int[] nums, int k) {
       //Get sum of starting Windpw
       int sum=0;
       for(int i=0;i<k;i++){
        sum+=nums[i];
       } 
       int maxSum=sum;
       //start sliding window
       int startIndex=0;
       int endIndex=k;
       while(endIndex<nums.length){
        sum-=nums[startIndex]; //remove previous element
        startIndex++;
        sum+=nums[endIndex]; // add next element
        endIndex++;
        maxSum=Math.max(maxSum,sum); //update maxSum       
       }
    return (double) maxSum/k;   //return average
    }
}