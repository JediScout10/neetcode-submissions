class Solution {
    public int longestConsecutive(int[] nums) {
         HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
int max=0;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            if(!set.contains(current-1)){
                int currentStreak=1;
                while(set.contains(current+1)){
                    current++;
                    currentStreak++;
                }
          max=Math.max(currentStreak,max);  }
        }
    return max;}
}
