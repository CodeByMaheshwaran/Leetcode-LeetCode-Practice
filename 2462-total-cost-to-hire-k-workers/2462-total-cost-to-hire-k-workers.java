class Solution {

    public long totalCost(int[] costs, int k, int candidates) {
       int left=0,right=costs.length-1;
       Queue<Integer> q1=new PriorityQueue<>();
       Queue<Integer> q2=new PriorityQueue<>();
       long res=0;
       for(int i=0;i<k;i++){
        while(q1.size()<candidates && left<=right){
            q1.offer(costs[left]);
            left++;
        }
        while(q2.size()<candidates && left<=right){
            q2.offer(costs[right]);
            right--;
        }
        int first=Integer.MAX_VALUE;
        int last=Integer.MAX_VALUE;
        if(!q1.isEmpty()){
            first=q1.peek();
        }
        if(!q2.isEmpty()){
            last=q2.peek();
        }
        if(first<=last){
            res+=first;
            q1.poll();
        }else{
            res+=last;
            q2.poll();
        }
       }
    return res;    
    }
}