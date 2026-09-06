class Solution {
    public int maxNumberOfBalloons(String text) {

        char[] word = "balloon".toCharArray();
        Map<Character,Integer> counter = new HashMap<>();

        for(char c: word) counter.put(c, 0);


        for(char c: text.toCharArray()){
            if(counter.containsKey(c)){ counter.put(c, counter.get(c) + 1); }
        }
        
        int result = 9999999;

        for(Map.Entry<Character, Integer> entry : counter.entrySet()){
            
            int c = 0;
            if( entry.getKey() == 'o' || entry.getKey() == 'l') c = entry.getValue()/2;
            else c = entry.getValue();

            result = result > c? c: result;
        }
        return result;
    }
}