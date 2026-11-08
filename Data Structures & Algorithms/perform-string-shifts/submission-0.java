class Solution {
    public String stringShift(String s, int[][] shift) {
        
        char [] text = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
         for(char c: text) stack.push(c);

        for(int[] pos: shift) {
           
            int amount  = pos[1];
            System.out.println(stack);
                while(amount > 0){
                   if(pos[0] == 1) stack.addLast(stack.pop());
                   else stack.push(stack.pollLast());
                   amount--;
                }

               
  
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

      return sb.reverse().toString(); 
    }
}
