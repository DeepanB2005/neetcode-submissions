class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m=1;
        boolean z=false;
        int zc=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zc++;
                z=true;
                continue;
            }
            m*=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(z)
            {
                if(zc>1)
                {
                    nums[i]=0;
                }
                else if(nums[i]==0)
                {
                    nums[i]=m;
                }
                else
                {
                    nums[i]=0;
                }
            }
            else
            {
                nums[i]=m/nums[i];
            }
        }
        return nums;
    }
}