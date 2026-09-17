class Solution {
    public int mySqrt(int x) {
        
        int l = 1;
        int r = x;

        while(l <= r) {

        int m = l +(r - l)/2;

        double k = (double)m * m;

        if(k == x) return m;

        if( k < x) l = m + 1;
        else r = m - 1;
        }

        return r;


    } // 1 2 3 4 5 6 7 8 9
}