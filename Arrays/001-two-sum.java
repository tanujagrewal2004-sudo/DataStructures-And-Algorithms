class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (seen.containsKey(num)) {
                return new int[]{seen.get(num), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{};
    }
}