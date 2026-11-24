class Solution {
    public String makeGood(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder builder= new StringBuilder();

        for(char c: s.toCharArray()) {

            if(stack.isEmpty()) stack.push(c);
            else if (c != stack.peek() && Character.toLowerCase(c) == Character.toLowerCase(stack.peek())){
                stack.pop();
            }
            else stack.push(c);
        }

        while(!stack.isEmpty()) {

            builder.append(stack.pop());

        }

        return builder.reverse().toString();
    }
}
