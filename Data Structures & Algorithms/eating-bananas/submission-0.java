class Solution {
    public int minEatingSpeed(int[] piles, int k) {
        int l=1;
        int h=0;
        for(int i:piles)
        {
            if(h<i)
            {
                h=i;
            }
        }

        while(l<=h)
        {
            int m=l+(h-l)/2;
            long t=0;
            for(int i:piles)
            {
                t+=Math.ceil((double)i/m);
            }
            if(t<=k)
            {
                h=m-1;
            }
            else l=m+1;
        }
        return l;
    }
}
