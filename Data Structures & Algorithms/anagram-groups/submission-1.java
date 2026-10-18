class Solution {
    public char[] st(String s)
    {
        char []a=s.toCharArray();
        Arrays.sort(a);
        return a;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>>l1=new ArrayList<>();
        Map<String,Integer>map=new HashMap<>();
        int c=0;

        for(int i=0;i<strs.length;i++)
        {
            String s=new String(st(strs[i]));
            if(map.containsKey(s))
            {
                l1.get(map.get(s)).add(strs[i]);
            }
            else
            {
                List<String>l=new ArrayList<>();
                l.add(strs[i]);
                l1.add(l);
                map.put(s,c++);
            }
        }
        return l1;
    }
}