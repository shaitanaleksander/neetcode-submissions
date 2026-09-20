class Solution {
    public int maxProfit(int[] prices) {

        int result = 0;


        for(int i = 0; i < prices.length; i++){
        int j = i + 1;

        while(j < prices.length){

            int p = prices[j] - prices[i];
            result = Math.max(p, result); 
            j++;
        }
        }

        return result;
    }
}
