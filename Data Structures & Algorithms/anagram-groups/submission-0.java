class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>  vault = new HashMap<String,List<String>>();

        for(String s: strs){

            char[] c = s.toCharArray();
            Arrays.sort(c);
            String st = new String(c);
            
            if(vault.containsKey(st)) {

                vault.get(st).add(s);
            }
            else{

                List<String> temp =  new ArrayList<>();
                temp.add(s);
                vault.put(st, temp);
            }
        }

        return new ArrayList<List<String>>(vault.values());
    
    }
}
