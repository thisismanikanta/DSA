class MajorityElement {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int num=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                num=nums[i];
            }
            else if(num==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==num){
                count1++;
            }
        }
           if(count1>(n/2)){
            return num;
           }
        
        return -1;
    }
}
