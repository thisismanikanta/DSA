class SortColors {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int index=0;
        int c1=0,c2=0,c3=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c1++;
            }
            else if(nums[i]==1){
                c2++;
            }
            else{
                c3++;
            }
        }
        while(c1>0){
            nums[index++]=0;
            c1--;
        }
        while(c2>0){
            nums[index++]=1;
            c2--;
        }
        while(c3>0){
            nums[index++]=2;
            c3--;
        }
    }
}
