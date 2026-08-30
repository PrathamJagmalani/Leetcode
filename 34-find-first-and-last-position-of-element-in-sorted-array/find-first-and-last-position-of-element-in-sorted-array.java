class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first=findfirst(nums,target);
       int last=findlast(nums,target);
       return new int[]{first,last};
      }

      private int findfirst(int[] nums,int target){
        int start=0,end=nums.length-1,ans=-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1; //search on left side 
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

         }
         return ans;
      }

private int findlast(int[] nums,int target){
        int start=0,end=nums.length-1,ans=-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1; //search on right side 
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

         }
         return ans;
      }

} 