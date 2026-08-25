class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i = 0; i < arr.length; i++){
            int num = 0;

            for(int j = i+1; j< arr.length; j++){
                num = num > arr[j]? num: arr[j]; 
            }
            arr[i] = num;
        }

        arr[arr.length - 1] = - 1;
        return arr;
    }
}