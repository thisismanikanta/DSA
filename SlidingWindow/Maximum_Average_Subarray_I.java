// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxsum=Integer.MIN_VALUE;
        int left=0;
        int cursum=0;
        for(int right=0;right<nums.length;right++){
            cursum+=nums[right];
            if(right-left+1==k){
              if(cursum>maxsum){
                maxsum=cursum;
              }
              cursum-=nums[left];
              left++;
            }
        }
        return (double) maxsum/k;
    }
}
