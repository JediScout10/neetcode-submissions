class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char c= t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int missing=t.length();
        int L=0;
        int R=0;
        int bestLen=Integer.MAX_VALUE;
        int bestStart=0;
while(R<s.length()){
    char c=s.charAt(R);
   if(map.containsKey(c)){
    if(map.get(c) > 0){
        missing--;
    }
    map.put(c,map.get(c)-1);
}
    while(missing==0){
        int length=R-L+1;
         if (length < bestLen) {
                    bestLen = length;
                    bestStart = L;
                }
        char leftChar=s.charAt(L);
        if(map.containsKey(leftChar)){
map.put(leftChar,map.get(leftChar)+1);
if (map.get(leftChar) > 0) {
                        missing++;
                    }
        }
        L++;
    }
    R++;
}
if (bestLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(bestStart, bestStart + bestLen);

    }
}
