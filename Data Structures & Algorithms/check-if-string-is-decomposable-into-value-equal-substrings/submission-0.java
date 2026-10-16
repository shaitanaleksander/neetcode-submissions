class Solution {
    public boolean isDecomposable(String s) {
        boolean result = false;
        int len = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                if (len % 3 != 0) {
                    if (!result && len % 3 == 2) {
                        result = true;
                    } else
                        return false;
                }
                len = 1;
            }
            else len++;
        }
         if (len % 3 != 0) {
                    if (!result && len % 3 == 2) {
                        result = true;
                    } else
                        return false;
                }
        return result;
    }
}
