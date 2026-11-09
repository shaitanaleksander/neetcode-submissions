class StringIterator {

    Deque<Character> queue = new ArrayDeque<>();

    public StringIterator(String compressedString) {

           char[] text =  compressedString.toCharArray();


        for(int i = 0; i < text.length; i++){

            if(Character.isDigit(text[i])){
                int rep = 0;
                
                while(i < text.length && Character.isDigit(text[i])){
                   rep += text[i] - '0';
                   rep *=10;
                   i++;
                }
                i--;
                rep /=10;
                while(rep > 1) {
                    queue.push(queue.peek());
                    rep--;
                }
            }
            else queue.push(text[i]);
        } 
 
                
    }
    
    public char next() {
       
            return queue.pollLast();
    }
    
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
