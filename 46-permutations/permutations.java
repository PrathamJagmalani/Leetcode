class Solution {
    private void getPerms(int[] nums, int idx, List<List<Integer>> permute){
       
        if(idx == nums.length){
            List<Integer> list=new ArrayList<>();
            for(int n : nums){
                list.add(n);
            }
            permute.add(list);
            return;
        }
        for(int i=idx;i<nums.length;i++){
          int temp=nums[idx];
          nums[idx]=nums[i];
          nums[i]=temp;

          getPerms(nums,idx+1,permute);
          
          temp=nums[idx];
          nums[idx]=nums[i];
          nums[i]=temp;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute=new ArrayList<>();
        getPerms(nums,0,permute);
        return permute;
    }
}