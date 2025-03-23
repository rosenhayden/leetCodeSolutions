/*
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
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        int complement = 0;
        int[] twoSum = new int[2];
        for(int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (numsMap.containsKey(complement) && i != numsMap.get(complement)) {
                twoSum[0] = i;
                twoSum[1] = numsMap.get(complement);
                break;
            }
        }

        return twoSum;
}

}
