class Solution {
    public int maxSubArray(int[] nums) {
        // Track the overall maximum subarray sum found so far
        int maxSoFar = nums[0];
        
        // Track the maximum subarray sum that ends at the current index
        int currentMax = nums[0];
        
        // Loop through the array exactly once (starting from index 1)
        for (int i = 1; i < nums.length; i++) {
            // Decide: Is it better to add the current number to our existing running sum,
            // or should we throw away the past and start a fresh subarray at nums[i]?
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // If our current path gave us a new highest record, update maxSoFar
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        
        return maxSoFar;
    }
}
