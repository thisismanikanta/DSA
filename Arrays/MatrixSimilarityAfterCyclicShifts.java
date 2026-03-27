// Example 1:
// Input: mat = [[1,2,3],[4,5,6],[7,8,9]], k = 4
// Output: false

// Example 2:
// Input: mat = [[1,2,1,2],[5,5,5,5],[6,3,6,3]], k = 2
// Output: true

class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int shift=k%n;
        for(int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    if(mat[i][j]!=mat[i][(j+shift)%n]){
                        return false;
                    }
                }
            }
            else{
                for(int j=0;j<n;j++){
                    if(mat[i][j]!=mat[i][(j-shift+n)%n]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
