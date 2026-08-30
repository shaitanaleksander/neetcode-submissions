class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int index = 0;
        Arrays.sort(nums);
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                index = counter > result ? nums[i - 1] : index;
                result = Math.max(counter, result);
                counter = 1;
            } else
                counter++;
        }
        index = counter > result ? nums[nums.length - 1] : index;
        result = Math.max(counter, result);

        return index;
    }
}