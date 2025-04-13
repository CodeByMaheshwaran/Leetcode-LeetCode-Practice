class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result= new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int left=0;
            int right=potions.length-1;
            int answerForCurrSpell=0;
            while(left<=right){
                int mid=left+(right-left)/2;
                long productOfStrength=(long)spells[i]*potions[mid];
                if(productOfStrength<success){
                    left=mid+1;
                }else if(productOfStrength>=success){
                    answerForCurrSpell=potions.length-mid;
                    right=mid-1;
                }
            }
          result[i]=answerForCurrSpell;
        }
     return result;   
    }
}