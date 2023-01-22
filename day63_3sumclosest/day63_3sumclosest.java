class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length-1];
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int ap = i+1;
            int bp = nums.length-1;
            
            while(ap<bp){
                int curSum = nums[i] + nums[ap] + nums[bp];
                if(curSum == target) return target;
                if(curSum > target) bp--;
                if(curSum < target) ap++;
                
                if(Math.abs(curSum - target) < Math.abs(result - target)) result = curSum;
            }
        }
        return result;
    }
}
