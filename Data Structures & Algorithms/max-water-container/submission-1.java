class Solution {
    public int maxArea(int[] heights) {
        int L=0;
        int R=heights.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(L<R){
            int height=Math.min(heights[L],heights[R]);
            int widgth=R-L;
            int area=height*widgth;
            maxArea=Math.max(maxArea,area);
            if(heights[R]>heights[L]){
                L++;
            }else{
                R--;
            }
            

        }
   return maxArea; }
}
