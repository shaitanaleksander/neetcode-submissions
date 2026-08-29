class Solution {
    public int trap(int[] height) {

        int result = 0;

            
            int left = 0;
             int right = height[0];

        for(int i = 0; i < height.length; i++){
        
       
        int pointer = i + 1;

        if(height[i] == right){
             right = 0;
            while(pointer < height.length){              
                right = right > height[pointer]? right: height[pointer];
                pointer++;
            }
        }
            int water = right > left? left - height[i]: right - height[i];

            if(water > 0) result += water;
            left = left > height[i] ? left: height[i];

        }

        return result;
    }
}
