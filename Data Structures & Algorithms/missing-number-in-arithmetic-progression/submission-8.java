class Solution {
    public int missingNumber(int[] arr) {
       
       int prog = Math.abs(arr[arr.length-1] - arr[0]) / arr.length;

        for(int i  = 1; i < arr.length; i++){

            if(Math.abs(arr[i] - arr[i - 1]) != prog) {

            return arr[i] > arr[i - 1]? arr[i -1] + prog: arr[i] + prog;


            }


        }
        return arr[0];

    }
}