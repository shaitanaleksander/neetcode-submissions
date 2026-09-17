class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int l = 0;
        int r = 0;

        for(int i: weights) {
            r += i;
            l = Math.max(l,i);
        }

        while(l < r){

            int m = l + (r - l) / 2;

            int c  = enought(weights, m, days);
            if(c <= 0) l = m + 1;
            else r = m;

        }

        
        return l;

    }//    |5 |6|  7 8 9  | 10 11 12 13 14 15



    private int enought(int [] arr, int kg, int days){

        int acc = 0;

        for(int i: arr){
            acc+= i;
            
            if(acc > kg){
                days--;
                acc = i;
            }
        }

        return days;
    }
}