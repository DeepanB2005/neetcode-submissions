class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>cur=new HashMap<>();
        for(char i:t.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int l=0;
        int m=Integer.MAX_VALUE;
        int tc=0;
        int r[]={-1,-1};
        for(int i=0;i<s.length();i++)
        {   char a=s.charAt(i);
            cur.put(s.charAt(i),cur.getOrDefault(s.charAt(i),0)+1);

            if(map.containsKey(a) && map.get(a).equals(cur.get(a)))
            {
                tc++;
            }
            while(tc==map.size())
            {
                char cl=s.charAt(l);
                if(m>(i-l+1))
                {
                    r[0]=l;
                    r[1]=i;
                    m=i-l+1;
                }
                if(map.containsKey(cl) && map.get(cl).equals(cur.get(cl)))
                {
                    tc--;
                }
                cur.put(cl,cur.get(cl)-1);
                    l++;
            }
        }
        return m==Integer.MAX_VALUE?"":s.substring(r[0],r[1]+1);
    }
}