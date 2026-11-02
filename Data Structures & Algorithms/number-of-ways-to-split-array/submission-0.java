class Solution {
    public int waysToSplitArray(int[] nums) {


        int l = 0;
        int r = 0;
        for(int i: nums) r += i;

        int res = 0;

        for(int i = 0; i < nums.length - 1; i++){

            l += nums[i];
            r -= nums[i];
            if(l >= r) res++;
        }

        return res;
    }
} 
