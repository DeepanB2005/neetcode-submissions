class Solution {

    public String sort(String s)
    {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        String a=sort(s1);

        for(int i=0;i<=s2.length()-n;i++)
        {
            System.out.println(s2.substring(i,i+n));
            if(sort(s2.substring(i,i+n)).equals(a))
            {
                return true;
            }
        }
        return false;
    }
}
