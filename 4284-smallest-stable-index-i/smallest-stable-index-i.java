class Solution {
    public int firstStableIndex(int[] nums, int k) {
      int n=nums.length;
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        int max=nums[i];
        
        for(int j=0;j<=i;j++){
            if(nums[j]>max)
             max=nums[j];
        }
        
        int min=nums[i];

        for(int j=i;j<n;j++){
            if(nums[j]<min){
                min=nums[j];
            }

        }

       arr[i]=max-min;
      }
    List<Integer> list=new ArrayList<>();
     for(int i=0;i<n;i++){
      if(arr[i]<=k)
      list.add(i);
     }
     if(list.size()==0){
        return -1;
     }
     return list.get(0);

    }
}