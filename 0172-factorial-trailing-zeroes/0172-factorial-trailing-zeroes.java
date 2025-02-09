class Solution {
    public int trailingZeroes(int n) {
    if(n<5) return 0;//factorial of < 5 have no trailing zero's
    int trailingZeroes=0;
    while(n!=0){
     trailingZeroes=trailingZeroes+(n/5);
     n=n/5;
    }
    return trailingZeroes;
    }
}