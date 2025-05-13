class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result= new ArrayList<>();
        backtrack(result,new ArrayList<>(),k,1,n);
      return result;  
     }
     private void backtrack(List<List<Integer>> result,List<Integer> curr,int k, int start,int n){
       if(curr.size()==k && n==0){
        result.add(new ArrayList<Integer>(curr));
        return;
       }
       for(int i=start;i<=9;i++){
        curr.add(i);
        backtrack(result,curr,k,i+1,n-i);
        curr.remove(curr.size()-1);
       }
     }
}