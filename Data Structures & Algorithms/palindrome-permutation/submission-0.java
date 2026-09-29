class Solution {
    public boolean canPermutePalindrome(String s) {

        int[] counter  = new int[26];

        for(Character c: s.toCharArray()) counter[c - 'a']++;

        boolean exept = false;

        for(int i: counter){

            if(i%2 != 0){

               if(exept) return false; 
                exept = true;
            }

        }

        return true;
    }
}
