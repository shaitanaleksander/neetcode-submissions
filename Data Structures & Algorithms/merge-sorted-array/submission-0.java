class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int pointer = nums1.length - 1; 
        n--;
        m--;

        while(n != -1 || m != -1){
            
            if(n == -1) nums1[pointer] = nums1[m--];
            else if(m == -1) nums1[pointer] = nums2[n--];
            else {
                nums1[pointer] = nums1[m] > nums2[n] ? nums1[m--]: nums2[n--];
            }
            pointer--;
        }


    }
}