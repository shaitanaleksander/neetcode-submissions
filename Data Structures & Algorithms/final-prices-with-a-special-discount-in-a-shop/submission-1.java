class Solution {
    public int[] finalPrices(int[] prices) {

        int [] result = new int[prices.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < prices.length; i++) {

            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();
                result[index] = prices[index] - prices[i]; 
            }
            stack.push(i);
        }


        while(!stack.isEmpty()){
            int i = stack.pop();
            result[i] = prices[i];
        }
        return result;
    }
}
