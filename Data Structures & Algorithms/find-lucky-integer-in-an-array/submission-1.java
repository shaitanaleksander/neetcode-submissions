class Solution {
    public int findLucky(int[] arr) {
        
        Map<Integer,Integer> counter = new HashMap<>();

        for(int i: arr){

            counter.computeIfAbsent(i, c-> 0);
            counter.put(i, counter.get(i) + 1);
        
        }

        int result = -1;

        for(Map.Entry<Integer, Integer> entry: counter.entrySet()) if(entry.getKey() == entry.getValue()) result = result > entry.getValue()? result: entry.getValue();

        return result;

    }
}