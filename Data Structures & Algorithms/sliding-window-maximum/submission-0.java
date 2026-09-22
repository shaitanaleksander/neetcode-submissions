class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int l = 0;
        int r = l;

        PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> b.number - a.number);

        while(r < k) {
            queue.add(new Pair(nums[r], r));
            r++;
        }

        
        List<Integer> result = new ArrayList<>();
        r--;

        while(r < nums.length){
           
           while(queue.peek().index < l) queue.poll();
            System.out.println(queue.peek().number);
           result.add(queue.peek().number);                  
            l++;
            r++;
            if(r >= nums.length) break;

            queue.add(new Pair(nums[r], r));
        } 
        
            int[] res = new int[result.size()];
            for(int i = 0; i < result.size(); i++) res[i] = result.get(i);

            return res;
        
    }


    class Pair{

        public int number;
        public int index;

        public Pair(int number, int index){

                this.number = number;
                this.index = index;
        }

    }
}

