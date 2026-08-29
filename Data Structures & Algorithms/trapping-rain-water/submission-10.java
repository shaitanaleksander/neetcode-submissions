class Solution {
    public int trap(int[] height) {

        int result = 0;
        int lmax = 0;
        int rmax = 0;

        int l =0;
        int r = height.length -1;

        while(l <= r){
            
            int water = 0;
            if(lmax > rmax){
                water = rmax - height[r];
                rmax = Math.max(rmax, height[r--]);
            }
            else{
                water = lmax - height[l];
                lmax = Math.max(lmax, height[l++]);
            }

            result+= water > 0? water:0;
        }
        return result;
    }
}
