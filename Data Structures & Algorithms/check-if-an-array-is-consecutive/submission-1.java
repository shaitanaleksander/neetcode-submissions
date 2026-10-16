class Solution {
    public boolean isConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int min = nums[0];;

        for(int n: nums){

            min = n > min? min:n;
            set.add(n);

        }

        int max = min + (nums.length-1);

        while(min <= max){

            if(!set.contains(min)) return false;
            min++;

        }
        return true;

    }
}
