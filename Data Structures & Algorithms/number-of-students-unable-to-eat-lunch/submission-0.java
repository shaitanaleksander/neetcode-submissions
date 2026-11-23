class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i: students) stack.push(i);
    

        int size = stack.size();
        int p = 0;


        while(size != 0){

         int st = stack.pollLast();

         if(st == sandwiches[p]) {
            p++;
            size = stack.size();
         }
         else {   
            stack.push(st);
            size--;
         }   
        }

        return stack.size();
    }
}