class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int result = 0;
        int counter = 0; 

        for(int i: nums){

            if(i == 0){
                result = result > counter? result : counter;
                counter = 0;
            }
            else counter++;
        }
        return result > counter? result: counter;
    }
}