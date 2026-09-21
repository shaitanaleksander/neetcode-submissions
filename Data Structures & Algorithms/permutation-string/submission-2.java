class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int [] core = new int[26];

        for(char s: s1.toCharArray()) core[s -'a']++;


        int p = 0;
        int l = p;
        int counter = 0;
        int [] temp = new int[26];

        while(p < s2.length()){ // counter chack imp please

            char c = s2.charAt(p);

            if(core[c - 'a'] > 0){

                int t = temp[c - 'a']+1; // fix
                temp[c - 'a'] = t;

                if(core[c - 'a'] < t){
                    if(s2.charAt(p) != s2.charAt(l)){
                         temp = new int[26];
                         counter = 0;
                         temp[c - 'a']++;
                         l = p;
                    }
                    else l++;

                 
                } // adcc  hdccd 
                else{
                    counter++;
                    if(counter == s1.length()) return true;
                 }
                
            }
            else{
                temp = new int[26];
                counter = 0;
                   l = p;
            }

            p++;
        } 
        return false;
    }
}
