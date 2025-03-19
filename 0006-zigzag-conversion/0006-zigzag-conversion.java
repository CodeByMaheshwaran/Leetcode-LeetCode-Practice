class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1){
        return s;
       } 
       String arr[]= new String[numRows];
       Arrays.fill(arr,"");
       int currRow=0,index=0,mod=0;
       int dir[]={1,-1};
       while(index<s.length()){
        arr[currRow]+=s.charAt(index);
        index++;
        int newRow=currRow+dir[mod];
        if(newRow<0 || newRow>=numRows){
            mod=(mod+1)%2;
            newRow=currRow+dir[mod];
        }
        currRow=newRow;
       }
       String result="";
       for(String st:arr){
        result+=st;
       }
    return result;   
    }
}