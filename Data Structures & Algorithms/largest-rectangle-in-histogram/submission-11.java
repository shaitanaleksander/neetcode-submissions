class Solution {
    public int largestRectangleArea(int[] heights) {
       
        Stack<int[]> stack = new Stack<>();
        stack.push( new int[]{0, heights[0]});
        int result = 0;

        for(int i = 1; i < heights.length; i++) {

            if(heights[i] <= stack.peek()[1]){
                int lastIndex = -1;

                while(!stack.isEmpty() && heights[i] <= stack.peek()[1]){
                
                int[] l = stack.pop();
                lastIndex = l[0];

                int candidate = l[1] * ( i - l[0]);
                result = result > candidate? result: candidate;

                }   
                stack.push(new int[]{lastIndex, heights[i]});
            }
            else stack.push(new int[]{i, heights[i]});            
       }

        while(!stack.isEmpty()){
            int [] candidate = stack.pop();
            int sum = candidate[1] * (heights.length - candidate[0]);
            result = result > sum? result: sum;
        }
        return result;
    } 
}
