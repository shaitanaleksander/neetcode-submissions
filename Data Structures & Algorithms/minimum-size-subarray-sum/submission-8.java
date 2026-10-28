class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result = 999999;


        int slow = 0;
        int accum = 0;


        for(int i = slow; i < nums.length; i++){

            accum += nums[i];            

            if(accum >= target){

                while(accum >= target){
                    result = Math.min(result, (i - slow) + 1);
                    accum-= nums[slow++];
                }


            }

        }

        return result == 999999? 0: result;
       
    }
}
