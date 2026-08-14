class Solution {
    public int findMin(int[] nums) {
        int L=0;
        int R=nums.length-1;
        while(L<R){
            int mid=(L+R)/2;
            if(nums[R]<nums[mid]){
                L=mid+1;

            }else {
                R=mid;
            }
        }
   return nums[L] ;}
}
