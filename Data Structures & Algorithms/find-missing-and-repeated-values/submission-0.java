class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        Set<Integer> pool = new HashSet<>();

        int[] result = new int[2];

        for(int[] i: grid){
            
            for(int n: i){
                
                if(pool.contains(n)){
                    result[0] = n;
                }
                pool.add(n);

            }
        }
        
        int counter = (int)Math.pow(grid.length, 2);

        for(int i = counter; i > 0; i--){

            if(!pool.contains(i)) result[1] = i;
        }

        return result;
    }
}