class Solution {
    public int hammingWeight(int n) {
        int ones=0;
        for(int i=0;i<32;i++){
            if((n&1)==1){
                ones++;
            }
            n>>=1;
        }
     return ones;   
    }
}