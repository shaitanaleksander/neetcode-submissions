class Solution {
    public int characterReplacement(String s, int k) {
        int[] counter = new int[27];
        int result = 0;

        int i = 0;
        int j = i;
        int c = 1;
        int max = 0;

        while (j < s.length()) {
            int q = counter[s.charAt(j) - 'A'] + 1;
            max = Math.max(max, q);
            counter[s.charAt(j) - 'A'] = q;

            if (c - max > k) {
                counter[s.charAt(i) - 'A']--;
                c--;
                i++;
            };

            result = Math.max(result, c);
            c++;
            j++;
        }

        return result;
    }
}
