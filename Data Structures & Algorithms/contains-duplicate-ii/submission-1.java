class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            if(count.containsKey(nums[i])){
                int index = count.get(nums[i]);
                if (Math.abs(index - i) <= k) return true;
                // else count.put(nums[i], i);
            }

            count.put(nums[i], i);

        }
        return false;
    }
}