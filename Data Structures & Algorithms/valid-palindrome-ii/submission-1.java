class Solution {
    public boolean validPalindrome(String s) {
        int t=0;
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return ispal(s.substring(l+1,r+1)) || ispal(s.substring(l,r));
            }
            l++;
            r--;
        }

        return true;

    }

    public boolean ispal(String s)
    {
        System.out.println(s);
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}