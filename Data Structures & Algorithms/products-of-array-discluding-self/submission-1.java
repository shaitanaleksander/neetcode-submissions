class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] suffix = new int[nums.length];
        int[] prefix = new int[nums.length];

        int saccum = 1;
        int paccum = 1;

        for(int i = 0; i < nums.length; i++){
            suffix[i] = saccum;
            prefix[nums.length - 1 - i] = paccum;

            saccum = saccum * nums[i];
            paccum = paccum * nums[nums.length - 1 - i];
        }

        for(int i = 0; i < nums.length; i++){
            nums[i] = suffix[i] * prefix[i];
        }

        return nums;
    }
}  
