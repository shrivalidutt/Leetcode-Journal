class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if (i>0 && nums[i] == nums[i-1]) continue;
            int fix = nums[i];
            int left = i+1;
            int right = nums.length-1;

            while (left < right){
                int sum = fix + nums[left]+ nums[right];
                if (sum == 0){
                    result.add(Arrays.asList(fix,nums[left],nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;  //SKIP DUPLICATES
                    
                    left++;
                    right--;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }          
        }
        return result; 
    }
}
