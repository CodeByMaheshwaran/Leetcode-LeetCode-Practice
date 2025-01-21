class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }else{
                int difference=Math.abs(map.get(nums[i])-i);
                if(difference<=k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
                
            }
            
        }
     return false;   
    }
}