class Solution {
    public int lengthOfLastWord(String s) {
        String str[]=s.split(" ");
        int l=str[str.length-1].length();
        return l;
    }
}