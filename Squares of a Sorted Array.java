class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n-1;
        int index = n-1;
        
        while(left<=right){
            int leftSum = nums[left]*nums[left];
            int rightSum = nums[right]*nums[right];
            if (leftSum > rightSum){
                result[index--] = leftSum;
                left++;
            }
            else{
                result[index--] = rightSum;
                right--;
            }
        }
        return result;
    }
}
