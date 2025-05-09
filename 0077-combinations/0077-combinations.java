class Solution {
    public List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> result=new ArrayList<>();   
     getSubset(1,n,k,result, new ArrayList<>());
    return result; 
    }
    public void getSubset(int start,int end,int k,List<List<Integer>> result, List<Integer> list){
     if(list.size()==k){
        result.add(new ArrayList<>(list));
     return;
     }
     for(int i=start;i<=end;i++){
        list.add(i);
        getSubset(i+1,end,k,result,list);
        list.remove(list.size()-1);
     }
    }
}