class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        int res[] =new int[2];
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                res[0]=start+1;
                res[1]=end+1;
                break;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return res;
    }
}

//output
//Example 1:

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
// Example 2:

// Input: numbers = [2,3,4], target = 6
// Output: [1,3]
// Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
