class Solution {
    public boolean isPalindrome(String st) {
        int n=st.length();

        String s=st.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.print(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
        }
        return true;
    }
}
