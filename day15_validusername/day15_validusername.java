/*

Home
HackerRank Java
Java Valid Username Regular Expression - HackerRank Solution
by
Afzal Imam
•
April 22, 2022
0

Java Valid Username Regular Expression - Hacker Rank Solution
Hello Friends, How are you? Today I am going to solve the HackerRank Java Valid Username Regular Expression Problem with a very easy explanation. This is the 23rd problem of Java on HackerRank. In this article, you will get more than one approach to solving this problem. So let's start-

Table of Contents

Java Valid Username Regular Expression - Hacker Rank Solution

HackerRank Java Valid Username Regular Expression - Problem Statement
You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
The first character of the username must be an alphabetic character, i.e., either lowercase character [A-Z] or uppercase character [A-Z].
*/

import java.io.*;
import java.util.*;

class UsernameValidator {
    /*
     * Write regular expression here.
     */
     public static final String regularExpression =
 "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
