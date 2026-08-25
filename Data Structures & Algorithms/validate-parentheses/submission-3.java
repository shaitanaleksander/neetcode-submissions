class Solution {
    public boolean isValid(String s) {
       
        
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> vault = Map.of(
    '[', ']',
    '(', ')',
    '{','}'
);

        for(char p: s.toCharArray()) {

        if(p == '('|| p == '{' || p == '[')stack.push(p);
        else {
            if(stack.size() == 0) return false;
             char c = stack.pop();
            if(vault.get(c) != p ) return false;
        }

        }

        return stack.isEmpty();
    }
}
