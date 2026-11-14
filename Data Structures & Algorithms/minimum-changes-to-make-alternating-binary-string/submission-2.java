class Solution {
    public int minOperations(String s) {

        char zero = '0';
        char one = '1';

        int o = 0;
        int z = 0;

        for(char c: s.toCharArray()){

            if(zero != c){
                z++;
            }
            zero = zero == '0'? '1':'0';

            if(one != c) o++;
            one = one == '1'? '0':'1';
        }

        return Math.min(o,z);
    }
}