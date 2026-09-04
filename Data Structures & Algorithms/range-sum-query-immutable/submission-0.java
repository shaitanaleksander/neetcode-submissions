class NumArray {

    private int [] nums;

    public NumArray(int[] nums) {
       this.nums = nums; 
    }
    
    public int sumRange(int left, int right) {
        
        int result = 0;
        while( left <= right){
            result+= nums[left++];

        }

        return result;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */