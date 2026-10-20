class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String i:strs)
        {
            sb.append(i.length());
            sb.append("#");
            sb.append(i);
        }
        System.out.print(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>l=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int n=Integer.parseInt(str.substring(i,j));
            l.add(str.substring(j+1,j+1+n));

            i=j+1+n;

        }

        return l;
    }
}
