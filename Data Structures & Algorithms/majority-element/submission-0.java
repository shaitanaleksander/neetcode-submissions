class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;

        Map<Integer, Integer> collector = new HashMap<>();
        collector.put(result, 0);

        for (int num : nums) {
            collector.computeIfAbsent(num, k -> 0);
            collector.put(num, collector.get(num) + 1);
        }

        for (Integer key : collector.keySet()) {
           
           result = collector.get(result) > collector.get(key)? result: key;
            
        }

        return result;
    }
}