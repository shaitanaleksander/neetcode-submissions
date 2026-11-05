class Solution {
    public int sumOfDigits(int[] nums) {
        int val = Integer.MAX_VALUE;

        for (int i : nums) val = Math.min(val, i);

        int r = 0;

        while (val > 0) {

            r += val % 10;

            val /=  10;

        // System.out.println(val);
        //     if (val == 0 && r  > 9) {
        //         val = r;
        //         r = 0;
        //     }
        }

        return r % 2 == 0 ? 1 : 0;
    }
}
