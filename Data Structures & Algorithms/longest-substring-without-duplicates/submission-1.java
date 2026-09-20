class Solution {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        Set<Character>  ch = new HashSet<>();

        for(int i = 0; i < s.length(); i++){

            int j = i;
           

            while(j < s.length()){
                if(ch.contains(s.charAt(j))) break;
                ch.add(s.charAt(j));
                j++;
            }

            result = Math.max(result, ch.size());
            ch.clear();

        }

        return result;
    }
}
