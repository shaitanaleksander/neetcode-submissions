class Solution {
    public boolean check(int[] nums) {

        
        int slow = 0;
        int size = nums.length;

        for(int i = 1; i < (size * 2); i++){
            if((i - slow) == nums.length) return true;

            int fast = i >= size? i % size : i;
            int prev = i-1;
            int pfast = prev >= nums.length? prev % size : prev;
       

            if( nums[pfast] > nums[fast]){
                slow = i;
            }
            
        }   
        return false;
    }
}