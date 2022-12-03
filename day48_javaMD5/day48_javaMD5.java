/*
Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.

Input Format

A single alphanumeric string denoting s.

Constraints

6 <= |s| <= 20
String s consists of English alphabetic letters (i.e., [a - zA - Z]  and/or decimal digits (i.e., 0 through 9) only.

Output Format

Print the MD-5 encryption value of s on a new line.

*/
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;


public class JavaMD5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(getMD5(s));
        sc.close();
    }

    private static String getMD5(String s) {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] result = md.digest(s.getBytes());
            for (int i = 0; i < result.length; i++) {
                String hex = Integer.toHexString(0xff & result[i]);
                if (hex.length() == 1)
                    sb.append('0');
                sb.append(hex);

            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return sb.toString();
    }

}
