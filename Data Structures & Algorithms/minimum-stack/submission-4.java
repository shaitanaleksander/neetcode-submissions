class MinStack {

    private int[] vault;
    private int pointer;
    private int min;

    public MinStack() {

        this.vault = new int[9999];
        this.pointer = 0;
        this.min = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        this.min = val > min? min : val;
        this.vault[pointer++] = val;    
    }
    
    public void pop() {  
       // if(pointer < 0) return;
        --pointer;
        if(min == this.vault[pointer]){
            min = Integer.MAX_VALUE;
             for(int i = pointer-1; i >= 0; i--) {
                min = vault[i] < min? vault[i] : min;
            }
        }

         this.vault[pointer] = 0; 
        
    }
    
    public int top() {
        return vault[pointer-1];
    }
    
    public int getMin() {
        return this.min;
    }
} // 2 12 4 8 
