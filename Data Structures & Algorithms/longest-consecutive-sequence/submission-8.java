class Solution {
    public int longestConsecutive(int[] nums) {
        
    Set<Integer> vault = new HashSet<>();
    int result = 0;

    for(int i = 0; i < nums.length; i++) vault.add(nums[i]);

    for(int i: vault){
        if(vault.contains(i+1)) continue;

        int counter = 1;
        
        for(int j = 1; j < vault.size(); j++){
            
            if(vault.contains(i-j)) counter++;
            else break;
        }

        result = Math.max(result, counter);
    }
        return result;
    }
} // 2,20,4,10,3,5 ;  
