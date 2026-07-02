class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character>map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        ArrayDeque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(map.containsKey(c)){
                stack.push(map.get(c));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char need=stack.pop();
                if(c != need){
                    return false;
                }
            }
        }
   return stack.isEmpty(); }
}
