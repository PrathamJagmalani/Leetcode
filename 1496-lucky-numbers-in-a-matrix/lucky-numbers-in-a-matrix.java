class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int[] min=new int[matrix.length];
        int[] max=new int[matrix[0].length];

        Arrays.fill(min,Integer.MAX_VALUE);
        Arrays.fill(max,Integer.MIN_VALUE);

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                min[i]=Math.min(matrix[i][j],min[i]);
                max[j]=Math.max(matrix[i][j],max[j]);
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==min[i] && matrix[i][j]==max[j])
               list.add(matrix[i][j]);
            }
          }
   return list;
}
}