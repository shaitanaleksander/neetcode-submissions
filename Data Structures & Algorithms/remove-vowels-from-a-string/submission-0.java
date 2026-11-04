class Solution {
    public String removeVowels(String s) {

    Set<Character> set = Set.of('a','e','i','o','u');


    StringBuilder str = new StringBuilder();

    for(char c: s.toCharArray()) {

        if(!set.contains(c)){
            str.append(c);
        }
    }

        return str.toString();
    }
}
