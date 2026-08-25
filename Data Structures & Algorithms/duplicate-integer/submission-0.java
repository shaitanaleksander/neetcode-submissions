class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> vault = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            
            if(vault.contains(nums[i])) return true;
            vault.add(nums[i]);
        }
        return false;
    }
}