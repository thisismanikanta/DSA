class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int count=1;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                count++;
            }
        }
        return count;
    }
}
