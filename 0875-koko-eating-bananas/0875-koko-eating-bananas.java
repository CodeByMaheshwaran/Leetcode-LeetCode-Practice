class Solution {
    private int findMax(int[] arr){
        int maximum=Integer.MIN_VALUE;
        
        for(int a:arr){
            maximum=Math.max(maximum,a);
        }
    return maximum;    
    } 
    private int calculateTotalHours(int[] piles,int hourly){
        int  totalHours=0;
        for(int pile: piles){
            totalHours+=(int) Math.ceil((double)pile/(double)hourly);
        }
     return totalHours;   
    }
    public int minEatingSpeed(int[] piles, int h) {
     int low=1;
     int high=findMax(piles);   
      while(low<=high){
        int mid=low+(high-low)/2;
        int totalHours=calculateTotalHours(piles,mid);
        if(totalHours<=h){
         high=mid-1;   
        }else{
            low=mid+1;
         }
        }
    return low;
    }
}