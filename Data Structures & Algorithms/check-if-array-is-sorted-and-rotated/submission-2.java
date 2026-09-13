class Solution {
    public boolean check(int[] nums) {

      int[] big = new int[nums.length * 2];

      for(int i = 0; i < nums.length; i++){
        big[i] = nums[i];
        big[nums.length + i] = nums[i];
      }      

        int slow = 0;
        int fast = 1;
        int counter = 1;

        while(slow != big.length && fast != big.length){
            if(counter == nums.length) return true;

            if(big[slow] > big[fast]){
                counter = 1;
            }
            else{
                counter++;
            }
            fast++;
            slow++;
           System.out.println(counter);
        }// 3,4,5,1,2 3,4,5,1,2

        return counter == nums.length;
        
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