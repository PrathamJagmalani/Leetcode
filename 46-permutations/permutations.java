class Solution {
    private void getPerms(int[] nums, int idx, List<List<Integer>> permute){
       
        if(idx == nums.length){
            permute.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
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