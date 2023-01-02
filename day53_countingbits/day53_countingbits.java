class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=1;i<=n;i++){
            res[i] = res[i/2] + i%2;
        }
        return res;
    }
}
// APPROACH2//***************************************************************************************
class Solution {
    public int[] countBits(int n) {
        int [] arr = new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=Bits(i);
        }
        return arr;
    }

    public static int Bits(int n){
        int count = 0;
       while(n!=0){
            count+=(n&1);
            n=n>>1;
       }
       return count;
    }
}
