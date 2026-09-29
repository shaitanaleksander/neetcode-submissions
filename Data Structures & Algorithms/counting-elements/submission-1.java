class Solution {
    public int countElements(int[] arr) {

    Map<Integer, Integer> nums = new HashMap<>();

    for(int i: arr){
         nums.merge(i, 1, Integer::sum);
    }

    int result = 0;

    for(int i: arr){
        
        if(nums.containsKey(i+1)){
        result++;
        }

    }
        return result;
    }
}
