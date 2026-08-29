class Solution {
    public int trap(int[] height) {

        int result = 0;
        int[] right = new int[height.length];

        int pointer = height.length - 1;
        int maxl = 0;
        while(pointer >= 0){
            right[pointer] = maxl;
            maxl = Math.max(height[pointer], maxl);
            pointer--;
        
        }

        maxl = 0;
        for(int i = 0; i < height.length; i++){

            int watter = Math.min(maxl, right[i]) - height[i];
            if (watter > 0) result += watter;
            maxl = Math.max(maxl, height[i]);
        }
        return result;
    }
}
