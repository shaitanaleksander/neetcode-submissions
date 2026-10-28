class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;


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
        return result == Integer.MAX_VALUE? 0: result;
       
    }
}
