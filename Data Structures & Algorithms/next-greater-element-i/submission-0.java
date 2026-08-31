class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int [] result = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            
            int j = 0;

            while(j < nums2.length && nums1[i] != nums2[j]){
                j++;
            }

            int next = j + 1;
            while(next < nums2.length && nums2[next] < nums2[j]){
                next++;
            }

            result[i] = next >= nums2.length? -1 : nums2[next];
        }

        return result;
    }
}