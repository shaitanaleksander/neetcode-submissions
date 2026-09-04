class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> pool = new HashSet<>();
        List<Integer> result = new ArrayList<>(); 

        for(int i: nums) pool.add(i);

        for(int i = nums.length; i > 0; i--){

            if(!pool.contains(i)) result.add(i);
        }
        return result;
    }
}