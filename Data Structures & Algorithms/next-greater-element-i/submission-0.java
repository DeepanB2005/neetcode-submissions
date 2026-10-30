class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int r[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    for(int k=j+1;k<nums2.length;k++)
                    {
                        if(nums2[k]>nums1[i])
                        {
                            r[i]=nums2[k];
                            break;
                        }
                    }
                }
            }
        }
        for(int i=0;i<r.length;i++)
        {
            if(r[i]==0)
            {
                r[i]=-1;
            }
        }
        return r;
    }
}