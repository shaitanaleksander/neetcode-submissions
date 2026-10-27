class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();


        for(String operator: operations){

           if(operator.equals("+")){
                int first  = stack.pop();
                int sum = first + stack.peek();
                stack.push(first);
                stack.push(sum);
           } 
           else if(operator.equals("D")){
                stack.push(2* stack.peek());
           }
           else if(operator.equals("C")) stack.pop();
           else stack.push(Integer.parseInt(operator));
           
        }

        int result = 0;

        while(stack.size() > 0) result+= stack.pop();
        return result;
    }
}