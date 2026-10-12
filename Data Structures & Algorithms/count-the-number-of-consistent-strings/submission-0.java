class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] letters = new int[26];

        for (Character c : allowed.toCharArray()) letters[c - 'a']++;

        int result = 0;

        for (String word : words) {
            boolean miss = false;

            for (Character c : word.toCharArray()) {
                if (letters[c - 'a'] < 1) {
                    miss = true;
                    break;
                }
            }
            result = miss ? result : result + 1;
        }

        return result;
    }
}