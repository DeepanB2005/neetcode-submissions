class Solution {
    public int longestConsecutive(int[] nums) {
        int m=0;
        Set<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                int l=1;
                while(set.contains(i+l))
                {
                    l++;
                }
                m=m>l?m:l;
            }
        }
        return m;
    }
}