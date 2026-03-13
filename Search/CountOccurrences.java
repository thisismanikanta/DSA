class Solution {
    public int countOccurrences(int[] arr, int target) {
        int n=arr.length;
        int[] res={-1,-1};
        for(int i=0;i<2;i++){

        int low=0,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                 res[i]=mid;
                 if(i==0){
                    high=mid-1;
                 }
                 else{
                    low=mid+1;
                 }
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(res[0]==-1) return 0;
        }
        return (res[1]-res[0])+1;
    }
}
