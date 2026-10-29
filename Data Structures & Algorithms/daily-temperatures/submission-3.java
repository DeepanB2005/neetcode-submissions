class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int r[]=new int[n];
        Stack<int[]>st=new Stack<>();
        for(int i=0;i<temp.length;i++)
        {
            while(!st.isEmpty() && st.peek()[0]<temp[i])
            {
                int t[]=st.pop();
                r[t[1]]=i-t[1];
            }
            st.push(new int[]{temp[i],i});
        }
        return r;
    }
}
