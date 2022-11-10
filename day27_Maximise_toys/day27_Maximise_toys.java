/*
Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. 
Your task is to find maximum number of toys you can buy with K amount. 

Example 1:

Input: 
N = 7 
K = 50
arr[] = {1, 12, 5, 111, 200, 1000, 10}
Output: 4
Explaination: The costs of the toys 
you can buy are 1, 12, 5 and 10.
*/
class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here 
        Arrays.sort(arr);
        int runningSum = 0, count = 0;
        for(int i=0; i<arr.length; i++){
            runningSum += arr[i];
            if(runningSum > K)
                break;
            
            count++;
        }
        return count;
    }
}
