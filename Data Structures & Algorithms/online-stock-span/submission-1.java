class StockSpanner {

    record Pair(int price, int befor) {};

    Deque<Pair> stack = new ArrayDeque<>();


     public StockSpanner() {
        
    }
    
    public int next(int price) {
        
        int befor = 1;
        while(!stack.isEmpty() && stack.peek().price() <= price){
            befor += stack.pop().befor;
        }
        
        Pair pair = new Pair(price,befor);

        stack.push(pair);
        return pair.befor;
    }



}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */