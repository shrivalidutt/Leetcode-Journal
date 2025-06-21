class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> missing = new ArrayList<>();
        for (int num : nums){
            set.add(num);
        }
        for (int i=1; i<= nums.length; i++){
            if (!set.contains(i)){
                missing.add(i);
            }
        }
        return missing;
    }
}
