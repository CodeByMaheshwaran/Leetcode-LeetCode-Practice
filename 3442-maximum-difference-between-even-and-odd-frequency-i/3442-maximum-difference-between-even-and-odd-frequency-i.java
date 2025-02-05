class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> map= new HashMap<>();
        int maxOdd=Integer.MIN_VALUE,minEven=Integer.MAX_VALUE;
        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            int count=entry.getValue();
            if(count%2!=0){
              maxOdd=Math.max(maxOdd,count);
            }else{
                minEven = Math.min(minEven, count);
            }
        }
     return maxOdd-minEven;   
    }
}