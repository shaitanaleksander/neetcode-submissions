class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result = 999999;


        int slow = 0;
        int fast = 1;
        int accum = nums[slow];

        while(fast <= nums.length){

            if(accum >= target) {

                result = result < (fast - slow) ? result :  (fast - slow);
                accum-= nums[slow++];
            }
            else{
                if(fast == nums.length) break;
                accum+= nums[fast++];
            }
        }

        return result == 999999? 0: result;
       
    }
}
