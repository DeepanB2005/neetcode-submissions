class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>>l=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }
        }
        Set<List<Integer>>set=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int t=-(nums[i]+nums[j]);
                if(map.containsKey(t) && map.get(t)!=i && map.get(t)!=j)
                {
                    List<Integer>l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[j]);
                    l1.add(t);
                    Collections.sort(l1);
                    set.add(l1);
                }
            }
        }
        for(List<Integer> i:set)
        {
            l.add(i);
        }
        return l;
    }
}