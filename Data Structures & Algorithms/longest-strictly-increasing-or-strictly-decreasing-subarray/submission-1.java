class Solution {
    public int longestMonotonicSubarray(int[] nums) {
      
      int in = 1;
      int de = 1;

        int counter = 1;

        for(int i = 1; i < nums.length; i++){
            if( nums[i - 1] <= nums[i]){
                in = counter > in? counter: in;
                counter = 1;
            }
            else counter++;
        }
        in = counter > in? counter: in;

        counter = 1;
        for(int i = 1; i < nums.length; i++){

            if(nums[i -1] >= nums[i]){
                de = counter > de? counter : de;
                counter = 1;
            }
            else counter++;
        }
        de = counter > de? counter : de;

        return  in > de? in:de;
    }
}