class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      Stack<Integer> helperStack=new Stack<>();
      int n=temperatures.length;
      int[] result= new int[n];
      for(int idx=n-1;idx>=0;idx--){
       //popping all indices with the lower or equal
       // temperature than the current index 
       while(!helperStack.isEmpty() && temperatures[idx]>=temperatures[helperStack.peek()]){
        helperStack.pop();
       }
       //If the stack has still the element
       // then next higher temperature exists !
       if(!helperStack.isEmpty()){
        result[idx]=helperStack.peek()-idx;
       }
       //inserting current index in the stack
       helperStack.push(idx); 
      }
    return result;    
    }
}