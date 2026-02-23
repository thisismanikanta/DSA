class ArrayLeader {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;
        int max=nums[n-1];
        arr.add(max);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                max=nums[i];
                arr.add(max);
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}
