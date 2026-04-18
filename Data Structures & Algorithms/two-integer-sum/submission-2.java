class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []result=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(map.containsKey(n)){
                result[0]=map.get(n);
                result[1]=i;
                return result;
            }
            map.put(nums[i],i);
        }
   return result; }
}
