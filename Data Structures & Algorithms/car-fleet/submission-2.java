class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double>st=new Stack<>();
        int a[][]=new int[position.length][2];
        
        for(int i=0;i<position.length;i++)
        {
            a[i][0]=position[i];
            a[i][1]=speed[i];
        }

        Arrays.sort(a,(i,b)->i[0]-b[0]);

        for(int []i:a)
        {
            double t=(double)(target-i[0])/i[1];
            while(!st.isEmpty() && st.peek()<=t)
            {
                st.pop();
            }
            st.push(t);
        }
        return st.size();

    }
}