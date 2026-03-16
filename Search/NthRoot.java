class Solution {
    public int NthRoot(int N, int M) {
        int low=1,high=M;
        while(low<=high){
            int mid=low+(high-low)/2;
            long power=(long) Math.pow(mid,N);
            if(power==M){
                return mid;
            }
            else if(power>M){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
