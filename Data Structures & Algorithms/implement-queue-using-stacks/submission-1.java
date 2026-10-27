class MyQueue {

    private Deque<Integer> in = new ArrayDeque<>();
    private Deque<Integer> out = new ArrayDeque<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        if(out.size() < 1){
            while(in.size() > 0) out.push(in.pop());
        }
        return out.pop();
    }
    
    public int peek() {
         if(out.size() < 1){
            while(in.size() > 0) out.push(in.pop());
        }
        return out.peek();
    }
    
    public boolean empty() {
        return (in.size() + out.size()) < 1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */