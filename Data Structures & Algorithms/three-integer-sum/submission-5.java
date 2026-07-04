class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>result=new HashSet<>();
         Arrays.sort(nums);

         for(int i=0;i<nums.length-2;i++){
            int L=i+1;
            int R=nums.length-1;
            while(L<R){
                 int sum=nums[i]+nums[L]+nums[R];
                if (sum==0){
                    result.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    L++;
                    R--;
                }else if(sum>0){
R--;
                }else{
                    L++;
                }
            }
         }
   return new ArrayList(result);}
}
