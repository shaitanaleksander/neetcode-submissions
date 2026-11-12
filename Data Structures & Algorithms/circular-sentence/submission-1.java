class Solution {
    public boolean isCircularSentence(String sentence) {

        String[] words = sentence.split(" ");

        char buf =  words[0].charAt(0);


        for(String str: words){

            if(buf != str.charAt(0)) return false;

            buf = str.charAt(str.length() - 1);
        }
        
        return words[0].charAt(0) == buf;
    }
}
