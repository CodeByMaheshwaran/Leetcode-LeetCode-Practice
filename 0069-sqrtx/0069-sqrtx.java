class Solution {
    public int mySqrt(int x) {
        long left=0;
        long right=x;
        long ans=0;
        while(left<=right){
            long mid = (left+right)/2;
            if(mid *mid==x){
                return (int) mid;
            }else if(mid*mid<x){
             left=mid+1;
             ans=mid;  // to find the Nearest Sqrt number 
            }else{
                right=mid-1;
            }
        }
    return (int) ans;    
    }
}