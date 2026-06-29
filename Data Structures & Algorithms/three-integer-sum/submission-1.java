class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
    continue;
int L=i+1;
int R=nums.length-1;
int target=0;
while(L<R){
    int sum=nums[i]+nums[L]+nums[R];
    if(sum==target){
        result.add(Arrays.asList(nums[i],nums[L],nums[R]));
        L++;
            R--;
        while(L<R && nums[L]==nums[L-1]){
    L++;
        }
while(L<R && nums[R]==nums[R+1]){
    R--;}
        
        
    }else if(sum>target){
R--;
    }else{
        L++;
    }
}
        }
   return result; }
}
