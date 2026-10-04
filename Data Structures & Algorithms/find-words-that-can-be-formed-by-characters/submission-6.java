class Solution {
    public int countCharacters(String[] words, String chars) {
 int[] counter = new int[26];
    for (char c : chars.replaceAll("[^a-z]", "").toCharArray()) counter[c - 'a']++;

    int result = 0;
    for (String raw : words) {
        String word = raw.replaceAll("[^a-z]", "");
        int[] temp = new int[26];
        boolean formed = true;

        for (char c : word.toCharArray()) {
            if (++temp[c - 'a'] > counter[c - 'a']) {
                formed = false;
                break;
            }
        }

        if (formed) result += word.length();
    }
    return result;
    }
}