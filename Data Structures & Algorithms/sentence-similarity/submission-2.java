class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length) return false;

        Map<String, List<String>> map = new HashMap<>();

        for(List<String> pair: similarPairs){

            if(!map.containsKey(pair.get(0))){
                map.put(pair.get(0), new ArrayList<>());
            }
            if(!map.containsKey(pair.get(1))){
                map.put(pair.get(1), new ArrayList<>());
            }
            
            map.get(pair.get(0)).add(pair.get(1));            
            map.get(pair.get(1)).add(pair.get(0));
        }

        for(int i = 0; i < sentence1.length; i++){

            if(!sentence1[i].equals(sentence2[i])){
                
                if(map.containsKey(sentence1[i])){
                    if(!map.get(sentence1[i]).contains(sentence2[i])) return false;
                }
                else return false;
            }

        }
        return true;
    }
}
