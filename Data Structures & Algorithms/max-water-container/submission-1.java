class Solution {
    public int maxArea(int[] heights) {
        int ans=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            int widht=r-l;
            int height=Math.min(heights[l],heights[r]);
            int max=height*widht;
            if(max>ans){
            ans=max;
            }
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }

        }
        
       
        return ans;
    }
}
