/*
Given an integer numRows, return the first numRows of Pascal's triangle.
*/

class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> temp = new ArrayList<>();
            int val = 1;
            for(int j=0;j<=i;j++)
            {
             temp.add(val);
             val = val*(i-j)/(j+1);
            }
            ans.add(temp);
        }
        return ans;
    }
}
