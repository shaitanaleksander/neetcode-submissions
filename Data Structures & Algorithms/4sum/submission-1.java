class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();


        for(int i = 0; i < nums.length; i++){

            for(int s = i+1; s < nums.length; s++){
                
                int l = s + 1;
                int r = nums.length -1;
                long tofind = target - ((long)nums[i] + nums[s]);

                while(l < r){
                    
                    long sum = (long)nums[l] + nums[r];

                    if(sum == tofind){
                        result.add(List.of(nums[i],nums[s], nums[l], nums[r]));
                        l++;
                    }
                    else if(sum > tofind) r--;
                    else l++;
                }
            }
        }
        return new ArrayList<>(result);

    }
}