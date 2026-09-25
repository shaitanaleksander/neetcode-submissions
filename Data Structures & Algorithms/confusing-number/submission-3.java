class Solution {
    public boolean confusingNumber(int n) {

        Map<Integer, Integer> nums = Map.of(0,0,1,1,6,9,8,8,9,6);

        int revers = 0;
        int base = n;

        while(base != 0){

            int s =  base % 10;
            base = base/10;

            if(!nums.containsKey(s)) return false;

            if(nums.containsKey(s)){
                s = nums.get(s);
            }

            revers = revers + s;

            if(revers != 0) revers *=10;

        }

        revers/=10;
        System.out.println(revers);
        return revers != n;


    }
}
