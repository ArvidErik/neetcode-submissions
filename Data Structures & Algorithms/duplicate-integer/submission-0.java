class Solution {
    public boolean hasDuplicate(int[] nums) {
        // create a HashSet to store the nums
        Set<Integer> seenNums = new HashSet<>();
        //iterate and check
        for (int num : nums) {
            if (seenNums.contains(num)) return true;
            seenNums.add(num);
        }
        return false;  
    }
}