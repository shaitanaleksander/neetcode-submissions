class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];


        for(Character c: magazine.toCharArray()) count[c - 'a']++;
        
        for(Character c: ransomNote.toCharArray()){

            if(count[c - 'a'] <=0) return false;
            count[c - 'a']--;

        }
        return true;
    }
}