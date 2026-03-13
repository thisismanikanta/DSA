class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] res={-1,-1};
        for(int i=0;i<2;i++){

        int low=0,high=n-1;
        int a=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                
                res[i]=mid;
                if(i==0){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        }
        return res;
    }
}
