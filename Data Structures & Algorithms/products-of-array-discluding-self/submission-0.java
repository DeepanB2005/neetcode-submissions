class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l=1;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=l;
            l=l*nums[i];
        }

        l=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            a[i]=l*a[i];
            l=l*nums[i];
        }
        return a;
    }
}  
