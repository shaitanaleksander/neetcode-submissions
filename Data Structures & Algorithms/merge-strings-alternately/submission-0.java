class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder builder = new StringBuilder();


        int l = 0;
        int r = 0;

        while(l < word1.length() && r < word2.length()) {
            builder.append(word1.charAt(l++));
            builder.append(word2.charAt(r++));
        }
        
        String left = l == word1.length() ? word2.substring(r) : word1.substring(l);

        builder.append(left);
        return builder.toString();
    }
}