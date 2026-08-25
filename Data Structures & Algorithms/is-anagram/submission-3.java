class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] vault = new int[30];

        for(int i = 0; i < s.length(); i++){
            vault[s.charAt(i) -'a']++;
            vault[t.charAt(i) -'a' ]--;
        }

        for(int i = 0; i < vault.length; i++) if(vault[i] != 0) return false;

        return true;

    }
}// 
