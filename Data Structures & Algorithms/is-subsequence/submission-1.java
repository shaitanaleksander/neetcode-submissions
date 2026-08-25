class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int pointer = 0;
        for(int i = 0; i < t.length(); i++){
        if(s.length() == pointer) return true;
        if(t.charAt(i) == s.charAt(pointer)) pointer++;

        }
        return s.length() == pointer;
    }
}