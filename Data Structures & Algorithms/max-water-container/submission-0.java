class Solution {
    public int maxArea(int[] heights) {
        
         int max = 0;

         int left = 0;
         int right = heights.length -1;


         while(left < right){
          
            int smallest = heights[left] > heights[right] ? heights[right] : heights[left];
    
            int size =  smallest * (right - left);
            max = max > size? max: size;
           int c = heights[left] > heights[right] ? right-- : left++;
         }

        return max;
    }

}
