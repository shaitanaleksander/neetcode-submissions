class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int [] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            
            int j =  nums2.length;
            int  bigger = -1;

            while( j-- >= 0) { // posible problem spot

            if(nums1[i] < nums2[j]){ bigger = nums2[j];}
            if(nums1[i] == nums2[j]) break;
                
            }

            result[i] = bigger;
        }


        return result;
    }
}