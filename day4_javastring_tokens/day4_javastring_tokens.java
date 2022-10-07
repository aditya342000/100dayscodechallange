//Given a string,s , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//We define a token to be one or more consecutive English alphabetic letters. 
//Then, print the number of tokens, followed by each token on a new line.
//Note: You may find the String.split method helpful in completing this challenge.
//Output Format:On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
// Next, print each of the n tokens on a new line in the same order as they appear in input s string .
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String S = sc.nextLine();
         String[] tokens = S.split("[^a-zA-Z]");
         int numTokens = 0;
        
         for (int i=0; i<tokens.length; ++i) 
             if (tokens[i].length() > 0) 
                 numTokens++;
             
         System.out.println(numTokens);
        
         for (int i=0; i<tokens.length;++i)
             if (tokens[i].length() > 0)
                 System.out.println(tokens[i]);
    }
}
