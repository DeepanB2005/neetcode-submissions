class Solution {
    public int search(int[] nums, int target) {
        return bs(0,nums.length-1,nums,target);
    }
    public int bs(int l,int r,int[]nums,int t)
    {
        if(l>r)return -1;
        int m=l+(r-l)/2;
        if(nums[m]==t)return m;
        else if(nums[m]>t)
        {
            return bs(l,m-1,nums,t);
        }
        else
        {
            return bs(m+1,r,nums,t);
        }

    }
}