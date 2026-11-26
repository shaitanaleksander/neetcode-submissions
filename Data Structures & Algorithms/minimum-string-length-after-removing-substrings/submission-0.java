class Solution {
    public int minLength(String s) {

        Deque<Character> stack = new ArrayDeque<>();


        for(char c: s.toCharArray()){

            if(!stack.isEmpty()  && (c == 'B' || c == 'D')){

                if(stack.peek() == 'A' && c == 'B'){
                    stack.pop();
                }
                else if(stack.peek() == 'C' && c == 'D'){
                    stack.pop();
                }
                else stack.push(c);
            }
            else stack.push(c);
        }
        return stack.size();
    }
}
