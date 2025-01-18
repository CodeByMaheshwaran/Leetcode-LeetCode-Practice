class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result= new ArrayList<String>();
        int n=nums.length;
        if(n==0) return result;
        for(int i=0;i<n;i++){
            int j=i;
            while(j+1<n && nums[j]+1==nums[j+1]){
                j++;
            }
            if(j>i){
                result.add(nums[i]+"->"+nums[j]);
            }else{
                result.add(nums[i]+"");
            }
            i=j;
        }
        return result;    
    }
}