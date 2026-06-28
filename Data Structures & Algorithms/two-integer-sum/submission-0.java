class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a hashmap to store the key-value pairs
        Map<Integer, Integer> numsMap = new HashMap<>();
        //loop through the nums array
        for(int i = 0; i < nums.length; i++){
            //define complement
            int complement = target - nums[i];
            if (numsMap.containsKey(complement)) {
                return new int[]{numsMap.get(complement), i};
            } 
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
