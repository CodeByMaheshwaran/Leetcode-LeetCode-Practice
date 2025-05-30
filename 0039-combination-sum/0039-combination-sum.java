class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> result= new ArrayList<>();
     Arrays.sort(candidates);
     backtrack(candidates,target,0,new ArrayList<>(),result);
    return result; 
    }
    private void backtrack(int[] candidates,int target, int start, List<Integer> curr,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(curr));
        return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target){
                break;
            }
           curr.add(candidates[i]);
           backtrack(candidates,target-candidates[i],i,curr,result);
           curr.remove(curr.size()-1);
        }
    }
}