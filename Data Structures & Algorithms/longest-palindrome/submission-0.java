class Solution {
    public int longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();


        for(char a: s.toCharArray()){

            map.merge(a,1,Integer::sum);
        }

        boolean one = false;
        int result = 0;
       for(Map.Entry<Character, Integer> entry : map.entrySet()){

        if(entry.getValue()%2 != 0 && !one){
                one = true;
                result+= (entry.getValue());
        }
        else{

            result+= entry.getValue()%2 == 0?entry.getValue(): entry.getValue()-1;

        }
       } 
        return result;
    }
}