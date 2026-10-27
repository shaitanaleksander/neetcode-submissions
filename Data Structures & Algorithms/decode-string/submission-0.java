class Solution {
    public String decodeString(String s) {
    
    Deque<Pair> stack = new ArrayDeque<>();

    int mult = 0;
    String cur = "";

    for(char c : s.toCharArray()){

        if(Character.isDigit(c)){
            mult = mult == 0? c - '0' : (mult * 10) + (c - '0');  
        }
        else if(c == '['){
            Pair pair =  new Pair();
            pair.str = cur;
            pair.mult = mult;
            stack.push(pair);
            cur = "";
            mult = 0;
        }
        else if(c == ']'){
            Pair pair = stack.pop();
            StringBuilder prev = new StringBuilder(pair.str);
            prev.append(cur.toString().repeat(pair.mult));
            cur = prev.toString();
        }
        else{ cur = cur + c; }
    }
    return cur;
    }


    class Pair{
        String str;
        int mult = 0;
    }
}