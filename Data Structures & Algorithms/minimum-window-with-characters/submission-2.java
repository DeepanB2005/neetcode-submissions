class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>tmap=new HashMap<>();

        int m=Integer.MAX_VALUE;
        for(char i:t.toCharArray())
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        int l=0;
        int r[]={-1,-1};
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
            if(map.containsKey(ch) && map.get(ch).equals(tmap.get(ch)))
            {
                c++;
            }
            while(c==map.size())
            {
                if(m>(i-l+1))
                {
                    m=i-l+1;
                    r[0]=l;
                    r[1]=i;
                }
                if(map.containsKey(s.charAt(l)) && map.get(s.charAt(l)).equals(tmap.get(s.charAt(l))))
                {
                    c--;
                }
                    tmap.put(s.charAt(l),tmap.get(s.charAt(l))-1);
                    l++;
                }
        }
        return m==Integer.MAX_VALUE?"":s.substring(r[0],r[1]+1);
    }
}