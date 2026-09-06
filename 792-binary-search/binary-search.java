class Solution {
    private int helper(int[] nums, int tar, int st, int end){
        if(st<=end){
            int mid=st+(end-st)/2;

            if(nums[mid] == tar)return mid;
            else if(nums[mid] <= tar)return helper(nums, tar, mid+1, end);
            else return helper(nums, tar, st, mid-1);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length-1);
    }
}