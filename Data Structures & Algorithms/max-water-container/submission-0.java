class Solution {
    public int maxArea(int[] heights) {
        int m=0;
        int l=0;
        int r=heights.length-1;

        while(l<r)
        {
            m=m>(heights[l]<heights[r]?heights[l]:heights[r])*(r-l)?m:(heights[l]<heights[r]?heights[l]:heights[r])*(r-l);
            if(heights[l]<heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return m;
    }
}
