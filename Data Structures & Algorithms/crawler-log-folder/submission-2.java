class Solution {
    public int minOperations(String[] logs) {

        Stack<String> stack = new Stack<>();


        for(String operation: logs){

            switch(operation) {
                case "../" -> { if(stack.size() > 0) stack.pop();}
                case "./"  ->  stack.size();
                default -> stack.push(operation);
            }
        }
            return stack.size();
            
    }
}