class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapper = new HashMap<>();
        Map<Character, Character> mapper2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            Character f = s.charAt(i);
            Character l = t.charAt(i);

            if(mapper.containsKey(f) && mapper.get(f) != l ) return false;
             if(mapper2.containsKey(l) && mapper2.get(l) != f ) return false;
            mapper.put(f,l);
            mapper2.put(l,f);
        }
        return true;
    }
}