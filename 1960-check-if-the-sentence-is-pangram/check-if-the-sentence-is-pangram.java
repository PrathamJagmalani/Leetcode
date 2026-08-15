class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean pangram;
        
        char arr[]=sentence.toCharArray();
         Set<Character> set=new HashSet<>();
         for(char c : arr){
            set.add(c);
         }
         if(set.size()==26){
            pangram=true;
         }else{
            pangram=false;
         }
         return pangram;
    }
}