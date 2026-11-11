class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int m=0;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<=heights.length;i++)
        {
            int c=(i==heights.length)?0:heights[i];
            while(!st.isEmpty() && heights[st.peek()]>c)
            {
                int h=heights[st.pop()];
                int w=st.isEmpty()?i:i-st.peek()-1;
                m=m>h*w?m:h*w;
            }
            st.push(i);
        }
        return m;
        
    }
}