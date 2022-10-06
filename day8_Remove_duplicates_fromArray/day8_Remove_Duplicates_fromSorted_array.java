/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.
Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores)
*/
class Solution {
    public int removeDuplicates(int[] nums) {
     int i = 0;
        for(int n : nums) {
            if(i == 0 || (i > 0 && n > nums[i-1])) {
                nums[i] = n;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums) + i);
        return i;
    }
}
