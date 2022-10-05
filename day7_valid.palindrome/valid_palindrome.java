/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward
and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.*/
class Solution {
   public boolean isPalindrome(String s) {
    if(s==null){
        return false;
    }
    s = s.toLowerCase();
    int i=0;
    int j=s.length()-1;
    while(i<j){
        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
                    || (s.charAt(i)>='0'&&s.charAt(i)<='9')))
        {
            i++;
        }
        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
                    || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
            j--;
        }
 
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
 
        i++;
        j--;
    }
 
    return true;
}
}
