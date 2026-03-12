class Solution {
    public int upperBound(int[] nums, int x) {
     int n=nums.length;
     int low=0,high=n-1;
     int res=n;
     while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]>x){
            res=mid;
            high=mid-1;
        }
        else{
           low=mid+1;
        }
     }
     return res;
    }
}
