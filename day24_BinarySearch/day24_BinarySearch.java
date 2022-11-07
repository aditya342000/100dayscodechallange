//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
//If target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.

class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if     
             (nums[mid] < target) lo = mid + 1;
            else if
             (nums[mid] > target) hi = mid - 1;
            else                        
             return mid;
        }
        return -1;
    }
}
