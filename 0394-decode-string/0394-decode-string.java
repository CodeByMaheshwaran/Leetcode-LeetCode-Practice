class Solution {
    public String decodeString(String s) {
     Stack<Integer> numberStack=new Stack<>();
     Stack<StringBuilder> stringStack=new Stack<>(); 
     int num=0;
     StringBuilder ans=new StringBuilder();
     for(char c: s.toCharArray()){
        if(Character.isDigit(c)){
         num=(num*10)+(c-'0');
        }
        else if(c=='['){
          numberStack.push(num);
          num=0;
          stringStack.push(ans);
          ans=new StringBuilder();
        }else if(c==']'){
         String str = ans.toString();
          ans=new StringBuilder(str.repeat(numberStack.pop()));            
          ans=stringStack.pop().append(ans);
        }else{
         ans.append(c);
        }
     }
    return ans.toString();    
    }
}