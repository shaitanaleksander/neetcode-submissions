class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int result = 0;
        map.put(0,1);
    


        for(int i = 0; i < nums.length; i++){
            
            sum+=nums[i];
            int rep = sum - k;
            if(map.containsKey(rep)) result+= map.get(rep);
            map.merge(sum,1,(a, b)-> a + b);
        
        }

        return result;
    }
}