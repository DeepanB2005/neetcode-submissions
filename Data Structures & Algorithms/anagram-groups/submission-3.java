class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs)
        {
            char[]a=s.toCharArray();
            Arrays.sort(a);
            String t=new String(a);
            if(!map.containsKey(t))
            {
                map.put(t,new ArrayList<>());
            }
            map.get(t).add(s);
        }
        return new ArrayList(map.values());
    }
}
