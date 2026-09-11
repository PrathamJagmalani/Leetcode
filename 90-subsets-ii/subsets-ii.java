class Solution {

    private static void allSubsets(int[] nums, List<Integer> ans, List<List<Integer>> subsetsWithDup,int i){
        Arrays.sort(nums);
        if(i == nums.length){
           subsetsWithDup.add(new ArrayList<>(ans)); 
           return;
        }
        ans.add(nums[i]);
        allSubsets(nums,ans,subsetsWithDup,i+1);

        int id=i+1;
        while(id<nums.length && nums[id]==nums[id-1]){
            id++;
        }
        ans.remove(ans.size()-1);
        allSubsets(nums,ans,subsetsWithDup,id);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsetsWithDup=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();

        allSubsets(nums, ans, subsetsWithDup, 0);
        return subsetsWithDup;
        
    }
}