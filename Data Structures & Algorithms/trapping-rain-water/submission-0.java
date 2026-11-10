class Solution {
    public int trap(int[] height) {
        
        int l=0;
        int r=height.length-1;
        int lm=height[l];
        int rm=height[r];
        int m=0;

        while(l<=r)
        {
            if(lm<rm)
            {
                lm=lm>height[l]?lm:height[l];
                m+=lm-height[l];
                l++;
            }
            else
            {
                rm=rm>height[r]?rm:height[r];
                m+=rm-height[r];
                r--;
            }
        }
        return m;
    }
}