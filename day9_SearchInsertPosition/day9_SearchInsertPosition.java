/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/

class Solution {
public int searchInsert(int[] nums, int target) {
int i=0;
for(i=0;i<nums.length && nums[i]<=target;i++){
if(target==nums[i])
return i;
}
return i;
}     
 
}
// APPROACH-2
// The complexity is O(n) in this case.
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums[0]>=target)
            return 0;
        
        int i;
        
        for(i = 1 ; i < nums.length ; i++)
        {
            if(nums[i]>=target)
                return i;
        }
        
        return i;
    }
}
