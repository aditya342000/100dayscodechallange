public class Solution {
public static int missingNumber(int[] nums) {
int n = nums.length + 1;
int expected = n * (n - 1)/2;
int actual = 0;
int i = 0;
while(i < nums.length){
actual+=nums[i++];
}
return expected - actual;
}
}
