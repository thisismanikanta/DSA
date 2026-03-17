class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n) return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int d:bloomDay){
            low=Math.min(low,d);
            high=Math.max(high,d);
        }
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,m,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    private boolean possible(int[] bloomDay,int m,int k,int days){
        int bouquets=0;
        int flowers=0;
        for(int d:bloomDay){
        if(d<=days){
             flowers++;
            
            if(flowers==k){
                bouquets++;
                flowers=0;
                if(bouquets>=m) return true;
            }
        }
        else{
            flowers=0;
           }
        }
        
      return false;
    }
}
