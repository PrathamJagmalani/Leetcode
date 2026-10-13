class Solution {
    public char kthCharacter(int k) {
       String str="a";
     
      for(int i=0;i<k;i++){
       String str2="";
         int j=0;
        while(j<str.length()){
            str2=str2+(char)(str.charAt(j)+1);
            j++;
        }
        str=str+str2;
        if(str.length()>=k)break;
       }
       return str.charAt(k-1);
    }
}