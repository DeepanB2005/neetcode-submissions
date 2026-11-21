class Solution {
    public int singleNumber(int[] nums) {
        int m=0;
        for(int i:nums)
        {
            m^=i;
        }
        return m;
    }
}
