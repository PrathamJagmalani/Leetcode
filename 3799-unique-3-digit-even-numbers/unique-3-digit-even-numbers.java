class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int d : digits){
           freq[d]++;
        }
        List<Integer> list=new ArrayList<>();
       for(int i=100;i<=998;i+=2){
          int a=i/100,b=(i/10)%10,c=i%10;
          int[] local = new int[10];
          local[a]++;
          local[b]++;
          local[c]++;
          boolean valid = true;
          for(int j=0;j<10;j++){
          if(local[j]>freq[j]){
            valid = false;
            break;
            }
          }
          if(valid)list.add(i);
       } 
       return list.size();
    }
}