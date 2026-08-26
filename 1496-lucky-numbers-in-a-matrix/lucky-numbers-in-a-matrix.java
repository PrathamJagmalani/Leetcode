class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minidx=min(matrix[i]);
            if(max(minidx,i,matrix.length,matrix))list.add(matrix[i][minidx]);
        }
        return list;
    }
    public boolean max(int minidx,int j,int n,int [][]matrix){
        for(int i=0;i<n;i++){
            if(matrix[j][minidx]<matrix[i][minidx])return false;
        }
        return true;
    }
    public int min(int[] arr){
        int minidx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[minidx]){
                minidx=i;
            }
        }
        return minidx;
    }
}