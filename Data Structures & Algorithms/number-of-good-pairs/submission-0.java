class Solution {
    public int numIdenticalPairs(int[] nums) {

        int[] counter = new int[101];


        for(int num: nums) counter[num]++;

        int result = 0;

        for(int c: counter){

            if(c != 0) result += (c *(c-1))/2;

        }

        return result;
    }
}