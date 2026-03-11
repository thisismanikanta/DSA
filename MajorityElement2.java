class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int num1=Integer.MIN_VALUE,num2=Integer.MIN_VALUE;
        int count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(count1==0 && num2!=nums[i]){
                count1=1;
                num1=nums[i];
            }
            else if(count2==0 && num1!=nums[i]){
                count2=1;
                num2=nums[i];
            }
            else if(num1==nums[i]){
                count1++;
            }
            else if(num2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(num1==nums[i]){
                c1++;
            }
            else if(num2==nums[i]){
                c2++;
            }
        }
        int min=(n/3)+1;
        List<Integer> li= new ArrayList<>();
        if(c1>=min){
           li.add(num1);
        }
        if(c2>=min && num1!=num2){
            li.add(num2);
        }
        return li;
    }
}
