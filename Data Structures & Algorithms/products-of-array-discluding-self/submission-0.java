class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] suffix = new int[nums.length];
        int[] prefix = new int[nums.length];

        int accum = 1;

        for(int i = 0; i < nums.length; i++){
            suffix[i] = accum;
            accum = accum * nums[i];
        }


        accum = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            prefix[i] = accum;
            accum = accum * nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = suffix[i] * prefix[i];
        }

        return nums;
    }
}  
