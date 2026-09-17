class Solution {
    public boolean isPerfectSquare(int num) {

        long l = 1;
        long r = num;

        while(l <= r){

            long m = l + (r-l) / 2;
        
            if(num == m * m) {
                return true;
                }

            if((m*m) < num)  l = m + 1;
            else r = m - 1;

        }
        return false;
    }
}
// 1 2 |3| 4 5 6 7 8 