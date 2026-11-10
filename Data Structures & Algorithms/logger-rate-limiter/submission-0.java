class Logger {


    private Map<String, Integer> map = new HashMap<>();

    public Logger() {
        
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(!map.containsKey(message)){
            map.put(message, 10 + timestamp);
            return true;
        }

        int time = map.get(message);

        if(timestamp >= time) {
            map.put(message, timestamp + 10);
            return true;
        }
        return false;
        
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
