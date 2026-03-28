// Given a non-empty grid mat consisting of only 0s and 1s, where all the rows are sorted in ascending order, find the index of the row with the maximum number of ones.
// If two rows have the same number of ones, consider the one with a smaller index. If no 1 exists in the matrix, return -1.

// Example 1
// Input : mat = [ [1, 1, 1], [0, 0, 1], [0, 0, 0] ]
// Output: 0
// Explanation: The row with the maximum number of ones is 0 (0 - indexed).
  
// Example 2
// Input: mat = [ [0, 0], [0, 0] ]
// Output: -1
// Explanation: The matrix does not contain any 1. So, -1 is the answer.

class Solution {
    public int rowWithMax1s(int[][] mat) {
       int n=mat.length;
       int m=mat[0].length;
       int row=0;
       int col=m-1;
       int maxrow=-1;
       while(row<n && col>=0){
         if(mat[row][col]==1){
           maxrow=row;
           col--;
         }
         else{
            row++;
         }
       }
       return maxrow;
    }
}
