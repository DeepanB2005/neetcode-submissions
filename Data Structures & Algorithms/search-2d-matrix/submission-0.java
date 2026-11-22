class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length*matrix[0].length-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            int mid=matrix[m/matrix[0].length][m%matrix[0].length];
            if(mid==target)
            {
                return true;
            }
            else if(mid>target)
            {
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return false;
    }
}