class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<int[]> stack = new Stack<>();
        int [] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            
            while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
             
             int day = stack.pop()[1];
             result[day] = i - day;    

            }

            stack.push( new int[] {temperatures[i], i});
        }

        return result;
    }
}
