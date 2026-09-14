class Solution {
    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while(left != right) {

            int middle = (left + right) / 2;

            if(nums[left] < nums[middle] &&  nums[right] < nums[middle]) {                
                left = middle;
            }
            else if( nums[left] > nums[right]) left++;
            else{
                right = middle;
            }
        }

        return nums[left];
    }
}
