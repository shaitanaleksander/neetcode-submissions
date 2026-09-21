class Solution {
    public String minWindow(String s, String t) {

        int [] core = new int [58];
        Set<Character> letters = new HashSet<>();

        for(char c: t.toCharArray()) {
            core[c - 'A']++;
            letters.add(c);
            }


        int l = 0;
        int p = l;

        int [] temp = new int [58];
        String result = "";

        while(p < s.length()){
            
            if(match(letters, core, temp)){
                String sub = s.substring(l , p);
                result = result.length() > sub.length() ? sub: result; 

                if(result == "") result = sub;

                temp[s.charAt(l) - 'A']--;
                l++;
            }
            else{
                 char c = s.charAt(p);
                 temp[c - 'A']++;
                 p++;
            }          
        }

            while(match(letters,core, temp)){
                
                String sub = s.substring(l , p);
                 result = result.length() > sub.length() ? sub: result; 

                if(result == "") result = sub;

                temp[s.charAt(l) - 'A']--;
                l++;
            }
         return  result;
    }

    private boolean match(Set<Character> letters, int[] core, int[] tmp){

        for(char c: letters){
            if(core[c -'A'] > tmp[c-'A']) return false;
        }
        return true;
    }
}
