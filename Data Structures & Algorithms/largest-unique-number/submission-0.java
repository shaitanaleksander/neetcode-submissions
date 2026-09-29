class Solution {
    public int largestUniqueNumber(int[] nums) {

        int[] arr = new int[2001];

        for(int i: nums) arr[i]++;

        for(int i = arr.length - 1; i >=0; i--){
            if(arr[i] == 1) return i;
        }
        
        return -1;
    }
}
