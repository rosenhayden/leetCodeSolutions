class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] numbers = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    numbers[0] = i;
                    numbers[1] = j;
                }
            }
        }
        return numbers;
    }
}
