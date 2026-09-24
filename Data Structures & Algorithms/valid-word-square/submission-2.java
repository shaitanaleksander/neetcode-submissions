class Solution {
    public boolean validWordSquare(List<String> words) {

        StringBuilder [] vert = new StringBuilder[501];
        for(int i = 0; i < vert.length; i++) vert[i] = new StringBuilder();

        for(String word: words){
            for(int i = 0; i < word.length(); i++){
                vert[i].append(word.charAt(i));
            }
        }

        for(int i = 0; i < words.size(); i++){

             if(!vert[i].toString().equals(words.get(i))) return false;

        }
        return true;
    }
}
