class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int left=0;
        int right=n-1;
        int ind=n-1;
        while(left<=right){
            int lsqr=nums[left]*nums[left];
            int rsqr=nums[right]*nums[right];
            if(lsqr>rsqr){
                arr[ind]=lsqr;
                left++;
            }
            else{
                arr[ind]=rsqr;
                right--;
            }
            ind--;
        }
        return arr;
    }
}
// output

//   Example 1:

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Example 2:

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]
