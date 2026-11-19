class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for(int i: nums1) set.add(i);

        Set<Integer> result = new HashSet<>();

        for(int i : nums2){
            if(set.contains(i)) result.add(i);
        }

        int[] r = new int[result.size()];
        
        int i = 0;

        for(Integer c: result){
            r[i++] = c;
        }

        return r;
    }
}