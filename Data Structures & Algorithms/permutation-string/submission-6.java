class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character ,Integer>map=new HashMap<>();
        HashMap<Character ,Integer>map1=new HashMap<>();
        for(int i =0;i<s1.length();i++){
            char c=s1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s1.length();i++){
            char c=s2.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            
        }
        
         if (map.equals(map1)) {
            return true;
        }

        for(int i= s1.length();i<s2.length();i++){
            char add = s2.charAt(i);
            map1.put(add, map1.getOrDefault(add, 0) + 1);
            
            char remove=s2.charAt(i-s1.length());
            map1.put(remove, map1.get(remove)-1);

            if(map1.get(remove)==0){
                map1.remove(remove);
            }

if(map.equals(map1)){
    return true;
}
        }

   return false; }
}
