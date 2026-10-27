class MyStack {

    private List<Integer> vault = new ArrayList<>();

    private int last = -1;

    public MyStack() {
        
    }
    
    public void push(int x) {
        last++;
        vault.add(x);
    }
    
    public int pop() {
      return vault.remove(last--);
    }
    
    public int top() {
        return vault.get(last);
    }
    
    public boolean empty() {
        return last < 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */