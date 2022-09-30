//Given an integer x, return true if x is palindrome integer.

//An integer is a palindrome when it reads the same backward as forward.

//For example, 121 is a palindrome while 123 is not.


class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0)
            return false;
        int reversed = 0, remainder , original = num;
        while(num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /=  10;
        }
        return original == reversed;
    }
}
