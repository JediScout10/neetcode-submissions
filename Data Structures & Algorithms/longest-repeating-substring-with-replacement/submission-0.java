class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq=new int[26];
        int maxFreq=0;
        int L=0;
        int maxWin=0;
        for(int R=0;R<s.length();R++){
            freq[s.charAt(R)-('A')]++;
maxFreq=Math.max(maxFreq,freq[s.charAt(R)-('A')]);
int window=R-L+1;
if(window-maxFreq>k){
     freq[s.charAt(L)-('A')]--;
     L++;
}
   maxWin=Math.max(maxWin,R-L+1); }
  return maxWin;
   }
}
