/*
The first line contains a single integer, n. denoting the length of array A =(a0, a1,...,α-1).

The second line contains n space-separated integers describing each respective element, a, in array A.

*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();
        
        int numNegativeSubarrays = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                
                int sum = 0;
                
                for(int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }
                
                if(sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }
        
        System.out.println(numNegativeSubarrays);
    }
}
