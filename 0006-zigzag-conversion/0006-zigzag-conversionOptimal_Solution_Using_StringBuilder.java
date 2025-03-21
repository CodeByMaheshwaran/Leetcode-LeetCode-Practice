class Solution {
    public String convert(String s, int numRows) {
       //If there is only one row return the string as it is
       if(numRows==1){
        return s;
       }

       // Create an array of strings to represent the rows
       StringBuilder[] rows=new StringBuilder[Math.min(numRows,s.length())];
       
       // Initialize all rows as empty StringBuilders
       for(int i=0;i<rows.length;i++){
        rows[i]=new StringBuilder();
       }
       int currRow=0;
       boolean goingDown=false;
       
       // Traverse the input string
       for(char c:s.toCharArray()){
        rows[currRow].append(c);
       
       // Change direction if we are at the top or bottom row
       if(currRow==0 || currRow==numRows-1){
        goingDown=!goingDown;
       }
       
       // Move the current row pointer
       currRow+=goingDown? 1:-1;
       }
       
       // Build the final result by concatenating all rows
       StringBuilder result=new StringBuilder();
       for(StringBuilder row:rows){
        result.append(row);
       }
    return result.toString();      
    }
}