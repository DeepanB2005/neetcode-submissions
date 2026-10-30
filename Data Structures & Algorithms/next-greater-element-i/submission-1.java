class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int st[]=new int[nums2.length];
        int r[]=new int[nums1.length];
        int t=-1;

        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],i);
        }

        for(int i=0;i<nums2.length;i++)
        {
            while(t!=-1 && nums2[i]>st[t])
            {
                int v=st[t--];
                if(map.containsKey(v))
                {
                    r[map.get(v)]=nums2[i];
                }
            }
            st[++t]=nums2[i];
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
