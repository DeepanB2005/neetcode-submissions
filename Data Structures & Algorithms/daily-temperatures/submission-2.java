class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(temp[j]>temp[i])
                {
                    temp[i]=j-i;
                    break;
                }
                if(j==n-1)temp[i]=0;
            }
            if(i==n-1)temp[i]=0;
            
        }
        return temp;
    }
}
