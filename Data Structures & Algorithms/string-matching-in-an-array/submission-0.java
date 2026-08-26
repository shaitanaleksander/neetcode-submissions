class Solution {
    public List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();

        Arrays.sort(words, (a,b) -> a.length() - b.length());

        for(String word: words){

            for(int i = 1; i < words.length; i++){
                
                String candidate = words[words.length - i];
                
                if(word == candidate) continue;
                if(candidate.contains(word)){ 
                    result.add(word);
                    break;
                }
            }
        
        }
        return result;
    }
}