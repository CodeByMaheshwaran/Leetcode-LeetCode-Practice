class Solution {
    public class Pair{
        int min;
        int sum;
        Pair(int sum,int min){
            this.sum=sum;
            this.min=min;
        }
    } 
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        Pair[] arr=new Pair[n];
        for(int i=0;i<n;i++){
            arr[i]=new Pair(nums1[i],nums2[i]);
        } 
      Arrays.sort(arr,(a,b)->b.sum-a.sum);
      PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.min - b.min);
      long answer=0;
      long sum=0;
      for(int i=0;i<arr.length;i++){
        pq.add(arr[i]);
        sum+=arr[i].sum;
        if(pq.size()>k){
           Pair top = pq.remove();
           sum-=top.sum;
        }
        if(pq.size()==k){
            long res=sum * pq.peek().min;
            answer = Math.max(answer,res);
        }
      }
    return answer;  
    }
}