class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        int low=0,high=n-1;
        if(n==1) return nums[0];
        if(nums[low]!=nums[low+1]) return nums[low];
        if(nums[high]!=nums[high-1]) return nums[high];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
