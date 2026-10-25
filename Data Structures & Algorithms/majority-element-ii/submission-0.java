class Solution {
    public List<Integer> majorityElement(int[] nums) {

        Set<Integer> result = new HashSet<>();
        Map<Integer, Integer> counter = new HashMap<>();

        float size = nums.length/3;

        for(int i = 0; i < nums.length; i++){

            int num = counter.getOrDefault(nums[i], 0);

            if(num + 1 > size){result.add(nums[i]);}

            counter.put(nums[i], num + 1 );
        }
        
        return new ArrayList<Integer>(result);
    }
}