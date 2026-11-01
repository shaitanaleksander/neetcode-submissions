class Solution {
    public int[] findErrorNums(int[] nums) {

        Set<Integer> set = new HashSet<>();        
        Arrays.sort(nums);
        int expected = 1;
        int duplicate = -1;
        int missed = -1;

        for(int i = 0; i < nums.length; i++){
            
            if(expected != nums[i]) {
                missed = expected;
                expected--;
            }

            if(set.contains(nums[i])) duplicate = nums[i];
            expected++;
            set.add(nums[i]);
        }

        
        return new int[] {duplicate, missed};
    }
}