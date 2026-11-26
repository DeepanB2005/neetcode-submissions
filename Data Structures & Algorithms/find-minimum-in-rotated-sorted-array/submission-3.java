class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int a=nums[0];
        while(l<=r)
        {
            if(nums[l]<nums[r])
            {
                return a<nums[l]?a:nums[l];
            }
            int m=l+(r-l)/2;
            a=a>nums[m]?nums[m]:a;
            if(nums[l]<=nums[m])
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
        return a;
    }
}
