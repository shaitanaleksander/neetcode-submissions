class Solution {
    public int singleNonDuplicate(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        while(l < r){

            int m = l + ( r - l) / 2;

            int odd = m%2;
            
            if((odd == 1 && nums[m-1] == nums[m]) || odd == 0 && nums[m+1] == nums[m]) l = m + 1;
            else r = m;

        }
        return nums[r];        
    }

}