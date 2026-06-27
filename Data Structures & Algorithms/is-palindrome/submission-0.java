class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int L=0;
        int R=s.length()-1;
        while(L<R){
            char c=s.charAt(L);
            char v=s.charAt(R);
            if(c != v){
                return false;
            }
            L++;
            R--;
        }
   return true; }
}
