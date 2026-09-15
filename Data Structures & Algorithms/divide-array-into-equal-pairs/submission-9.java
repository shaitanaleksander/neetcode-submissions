class Solution {
    public boolean divideArray(int[] nums) {
        
        int [] arr = new int [501];

        for(int i: nums) arr[i]++;

        for(int i: arr) System.out.println(i);

        for(int i: arr) {
          //  if(arr[i] == 1) return false;

            if (i !=0 && i % 2 != 0) return false;
        }
        return true;


    }
}