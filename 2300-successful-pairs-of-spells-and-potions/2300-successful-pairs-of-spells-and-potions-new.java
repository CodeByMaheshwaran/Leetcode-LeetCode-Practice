class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int[] result= new int[n];
        Arrays.sort(potions);
        
        for(int i=0;i<n;i++){
            int spell=spells[i];
            int left=0;
            int right=m-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                long productOfStrength=(long)spell*potions[mid];
                if(productOfStrength >=success){
                    right = mid-1;
                }else{
                    left=mid+1;
                }
            }
          result[i] = m-left;
        }
     return result;   
    }
}