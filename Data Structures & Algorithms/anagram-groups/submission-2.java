class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
Map<String, List<String>> vault = new HashMap<>();
    for (String s : strs) {
        int[] count = new int[26];
        for (char ch : s.toCharArray()) count[ch - 'a']++;

        StringBuilder sb = new StringBuilder(52);
        for (int i = 0; i < 26; i++) {
            sb.append('#').append(count[i]);
        }
        vault.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
    }
    return new ArrayList<>(vault.values());
    
    } }
