class Solution {
    
    public int removeDuplicates(int[] nums) {

        int result = 1;

        int slow  = 0;
        int fast = 1;

        while(fast < nums.length){

            if (nums[slow] == nums[fast]) fast++;
            else {
                nums[slow + 1] = nums[fast];
                slow++;
                fast++;
            }
        }
        return slow + 1;
    }
}