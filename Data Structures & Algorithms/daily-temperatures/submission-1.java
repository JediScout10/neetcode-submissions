class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        int [] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int ans=stack.pop();
                result[ans]=i-ans;
            }
            stack.push(i);
            }
       return result; }
    }

