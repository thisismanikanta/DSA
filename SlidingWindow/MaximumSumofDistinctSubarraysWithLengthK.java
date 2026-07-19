class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set= new HashSet<>();
        long cursum=0,maxsum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right]) || set.size()==k){
                set.remove(nums[left]);
                cursum-=nums[left];
                left++;
            }
            cursum+=nums[right];
            set.add(nums[right]);
            if(set.size()==k){
                maxsum=Math.max(cursum,maxsum);
            }
        }
        return maxsum;
    }
}

// Example 1:

// Input: nums = [1,5,4,2,9,9,9], k = 3
// Output: 15
// Explanation: The subarrays of nums with length 3 are:
// - [1,5,4] which meets the requirements and has a sum of 10.
// - [5,4,2] which meets the requirements and has a sum of 11.
// - [4,2,9] which meets the requirements and has a sum of 15.
// - [2,9,9] which does not meet the requirements because the element 9 is repeated.
// - [9,9,9] which does not meet the requirements because the element 9 is repeated.
// We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
// Example 2:

// Input: nums = [4,4,4], k = 3
// Output: 0
// Explanation: The subarrays of nums with length 3 are:
// - [4,4,4] which does not meet the requirements because the element 4 is repeated.
// We return 0 because no subarrays meet the conditions.
