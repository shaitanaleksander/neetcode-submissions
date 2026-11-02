class Solution {

    public long maximumSumScore(int[] nums) {


        long total = 0l;

        for(int i: nums) total += i;


        long left = 0;

        long res = Long.MIN_VALUE;

      //  System.out.println(total);

        for(int i = 0; i < nums.length; i++){
            
            left+= nums[i];
           

            long max = Math.max(left, total);
            res = Math.max(res, max);
            total-= nums[i];
        }
        return res == Long.MIN_VALUE? 0: res;
    }
}
