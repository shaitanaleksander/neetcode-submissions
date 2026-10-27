class Solution {
    public int[] asteroidCollision(int[] asteroids) {

         Deque<Integer> stack = new ArrayDeque<>();


        for(int i : asteroids) {
            
             if(stack.isEmpty()) stack.push(i);
             else{
                 boolean dest = false;
                 while(!stack.isEmpty()){
                 int ast = stack.peek();

                 if(ast > 0 && i < 0){
                    if(Math.abs(ast) < Math.abs(i)){
                        stack.pop();
                    }
                    else if(Math.abs(ast) == Math.abs(i)) {dest = true; stack.pop(); break;}
                    else break;
                 }
                 else {
                    stack.push(i);
                    break;
                    }
                 }

                 if(stack.isEmpty() && !dest) stack.push(i);
             }
            
        }
        
        
        int[] result = new int[stack.size()];
        int size = stack.size() - 1;

        while(size >= 0)  result[size--] = stack.pop();

        return result;
    }
}