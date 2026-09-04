class Solution {
    public String kthDistinct(String[] arr, int k) {

            Map<String, Integer> counter = new HashMap<>();

            for(String c: arr){

                counter.computeIfAbsent(c, t -> 0);
                counter.put(c,counter.get(c) + 1);

            }

        for(int i = 0; i < arr.length; i++){

            if( counter.get(arr[i]) == 1){
                k--;
            }

            if(k == 0) return arr[i];
        }

        return "";
    }
}