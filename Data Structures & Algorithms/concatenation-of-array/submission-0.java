class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];

        for (int i = 0; i < nums.length * 2; i++) {
            if (i < nums.length) {
                output[i] = nums[i];
            } else {
                output[i] = nums[i - nums.length];
            }
        }

        return output;
    }
}