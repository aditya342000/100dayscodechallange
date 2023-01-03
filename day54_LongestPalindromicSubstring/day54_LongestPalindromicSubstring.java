public class Solution 
{
     int max_len=0;
     int low=0;
    public String longestPalindrome(String s) 
    {
        int n=s.length();
        if(n<2) return s;
        for(int i=0;i<n-1;i++)
        {
           extend(s,i,i); //for cheking odd palidrome
           extend(s,i,i+1);//for checking even palidrome
        }
        return s.substring(low,low+max_len);
    } 
    private void extend(String s,int i,int j)  
    {
        int n=s.length();
        while(i>=0&&j<n&&s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        if(max_len<j-i-1)
        {
            low=i+1;
            max_len=j-i-1;
        }
    }
}
	
