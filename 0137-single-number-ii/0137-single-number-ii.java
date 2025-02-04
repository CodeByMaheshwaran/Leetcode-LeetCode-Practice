class Solution {
    public int singleNumber(int[] nums) {
        int ones=0; // Start with Bitwise Representation 00
        int twos=0; // Start with Bitwise Representation 00
        for(int element: nums){
         ones= (ones^element) & (~twos); // stores elements which occurs only one time
         twos=(twos^element) & (~ones); // stores elements which occurs only one time
        } //elements Which occurs three times is not stored in ones and also in twos;
    return ones; // which only stores the elemeny that occur only ones;
    }
}