class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int m=0;
        int r[]=new int[temp.length];
        for(int i=0;i<temp.length;i++)
        {
            int j=i+1;
            while(j<temp.length)
            {
                if(temp[i]<temp[j])
                {
                    r[i]=j-i;
                    break;
                }
                j++;
            }
        }
        return r;
    }
}
