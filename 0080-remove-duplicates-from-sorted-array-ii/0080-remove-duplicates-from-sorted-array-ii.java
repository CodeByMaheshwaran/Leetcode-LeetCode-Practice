class Solution {
    public int removeDuplicates(int[] nums) {
        // Since it is sorted array [1,1,1,2,2,3] it means i-2 =i both are same then number occurs more than 2 times and we dont need to check 1st two elements so i<2
        int i=0; 
        for(int n: nums){
            if(i<2 || n!=nums[i-2]){
                nums[i++]=n;
            }
        }
     return i;   
    }
}

/*class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;        
    }
}*/