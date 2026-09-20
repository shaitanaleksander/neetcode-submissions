class Solution {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;


        for(int i = 0; i < s.length(); i++){

            int j = i;
            Set<Character>  ch = new HashSet<>();

            while(j < s.length()){
                if(ch.contains(s.charAt(j))) break;
                ch.add(s.charAt(j));
                j++;
            }

            result = Math.max(result, ch.size());

        }

        return result;
    }
}
