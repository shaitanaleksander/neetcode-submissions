class Solution {
    public int arrangeCoins(int n) {

        int counter = 0;
        int p = 1;


        while(n > 0){
        
         n = n - p;
         if(n >= 0) counter++;
         p++;
        }

        return counter;
    }
}