class Solution {
    public boolean check(int[] nums) {
        
        int size = nums.length - 1;

        while(size >= 0){
            if(isSorted(nums)) return true;
            nums = revert(nums);
            size--;
        }
    
        return false;
    }

    private int[] revert(int[] arr){
        int [] result = new int[arr.length];

        for(int i = 1; i < arr.length; i++){
            result[i-1] = arr[i];
        }

        result[result.length -1] = arr[0];
        return result;
    }

    private boolean isSorted(int[] arr){
        
        for(int i = 1; i < arr.length; i++){

            if(arr[i-1] > arr[i]) return false;

        }

        return true;
    }
}