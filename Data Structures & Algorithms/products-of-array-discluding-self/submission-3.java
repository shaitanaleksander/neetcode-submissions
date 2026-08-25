class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    int[] output = new int[n];

    // Pass 1: output[i] = product of everything left of i
    int paccum = 1;
    for (int i = 0; i < n; i++) {
        output[i] = paccum;
        paccum *= nums[i];
    }

    // Pass 2: multiply in the suffix products on the fly
    int saccum = 1;
    for (int i = n - 1; i >= 0; i--) {
        output[i] *= saccum;
        saccum *= nums[i];
    }

    return output;
    }
}  
