class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length == 0) return 0;
        int result = 0;
        int acum = nums[0];

        for(int i = 1; i < nums.length; i++){

            if( nums[i-1] >= nums[i]){

                result = result > acum ? result : acum;
                acum = 0;
            }   
                acum+= nums[i];  
        }


        return result > acum? result: acum;
    }
}