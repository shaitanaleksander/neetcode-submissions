class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs, (a,b) -> a.length() - b.length());
        String result = "";

        for(int i = 0; i < strs[0].length(); i++){

            char c = strs[0].charAt(i);

            for(String word: strs){
            
            if( c != word.charAt(i)) return result;
            }

            result = result + c;
        }
            return result;
    }
}