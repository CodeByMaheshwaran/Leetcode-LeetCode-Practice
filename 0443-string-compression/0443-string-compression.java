class Solution {
    public int compress(char[] chars) {
        int index=0;
        int start=0;
        while(start<chars.length){
            int end=start;
            while(end<chars.length && chars[start]==chars[end]){
                end++;
            }
            int length=end-start;
            chars[index++]=chars[start];
            if(length>1){
                String s=String.valueOf(length);
                for(char ch: s.toCharArray()){
                    chars[index++]=ch;
                }
            }
            start=end;
        }
    return index;    
    }
}