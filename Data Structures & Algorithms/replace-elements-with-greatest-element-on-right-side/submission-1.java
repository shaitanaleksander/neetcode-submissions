class Solution {
    public int[] replaceElements(int[] arr) {

        int pointer =  arr[arr.length -1];
        arr[arr.length -1] = -1;

        for(int i = arr.length-2; i >= 0; i--){
            int v = arr[i];
            arr[i] = pointer;
            pointer = pointer > v ? pointer: v;
        }

        return arr;
    }
}