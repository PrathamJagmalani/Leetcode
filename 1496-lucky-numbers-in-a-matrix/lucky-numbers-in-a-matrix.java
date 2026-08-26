class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
       
        int m=matrix.length;
        int n=matrix[0].length;
        int[] min=new int[m];
        int[] max=new int[n];

        Arrays.fill(min,Integer.MAX_VALUE);
        Arrays.fill(max,Integer.MIN_VALUE);

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                min[i]=Math.min(matrix[i][j],min[i]);
                max[j]=Math.max(matrix[i][j],max[j]);
            }
        }

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(matrix[i][j]==min[i] && matrix[i][j]==max[j])
               list.add(matrix[i][j]);
            }
          }
   return list;
}
}