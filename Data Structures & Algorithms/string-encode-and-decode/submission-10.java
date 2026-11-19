class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs)
        {
            sb.append(s.length());
            sb.append("@");
            sb.append(s);
        }
        System.out.print(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>l=new ArrayList<>();
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='@')
            {
                int t=Integer.parseInt(str.substring(c,i));
                c=i+1+t;
                l.add(str.substring(i+1,i+t+1));
                i=i+t;
            }
        }
        return l;
    }
}
