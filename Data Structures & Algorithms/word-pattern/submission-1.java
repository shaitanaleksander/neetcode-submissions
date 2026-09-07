class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        Map<Character, String> counter = new HashMap<>();
        Map<String, Character> counter2 = new HashMap<>();
        
        for( int i = 0; i < words.length; i++){

            if(counter.containsKey(pattern.charAt(i)) && !counter.get(pattern.charAt(i)).equals(words[i])) return false;
            if(counter2.containsKey(words[i]) && counter2.get(words[i]) != (pattern.charAt(i))) return false;
            counter.put(pattern.charAt(i), words[i]);
            counter2.put(words[i],pattern.charAt(i));
        }
        return true;
    }
}