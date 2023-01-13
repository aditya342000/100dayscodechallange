class Solution {
    public boolean isMatch(String s, String p) {
        return isMatch(s, s.length()-1 ,p, p.length()-1);
    }
    
    private boolean isMatch(String s, int i1, String p, int i2)
    {
        if (i1 == -1 && i2 == -1) return true;
        else if (i2 == -1) return false;
        
        if (i1 >= 0 && (p.charAt(i2) == '.' || p.charAt(i2) == s.charAt(i1)))
        {
            return isMatch(s, i1-1, p, i2-1);
        }
		else if (p.charAt(i2) == '*')
        {
            char ch = p.charAt(i2-1);
            boolean isDot = ch == '.';

			// If matching character or dot character try to match remaing string for all possibilities
            for (int j = i1; j>=0 && (isDot || s.charAt(j) == ch); j--) 
            {
                if (isMatch(s, j-1, p, i2-2))
                    return true;
            }

            return isMatch(s, i1, p, i2-2); // Extra case where we want to not check the repeating character in s
        }
        else
        {
            return false;
        }
    }
}
