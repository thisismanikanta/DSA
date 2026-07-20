class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int cursum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            cursum+=nums[right];
            while(cursum>=target){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                }
                cursum-=nums[left];
                left++;
            }

        }
        if(minlen!=Integer.MAX_VALUE){
            return minlen;
        }
        return 0;
    }
}

// Example 1:

// Input: target = 7, nums = [2,3,1,2,4,3]
// Output: 2
// Explanation: The subarray [4,3] has the minimal length under the problem constraint.
// Example 2:

// Input: target = 4, nums = [1,4,4]
// Output: 1
// Example 3:

// Input: target = 11, nums = [1,1,1,1,1,1,1,1]
// Output: 0
