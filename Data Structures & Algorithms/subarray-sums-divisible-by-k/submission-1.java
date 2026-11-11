class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int acum = 0;
        int res = 0;


        for(int i = 0; i < nums.length; i++){
            
            acum += nums[i];

            int tem = acum % k;

            res+= map.getOrDefault(tem, 0);

            map.merge(tem, 1, (a,b) -> a + b);


        }

        return res;
        
    }
}