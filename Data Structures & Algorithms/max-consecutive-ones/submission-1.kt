class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxOnes = 0
        var count = 0

        // nums = [1,1,0,1,1,1]

        for (i in nums.indices) {
            if (nums[i] == 1) {
                count++
            } else {
                count = 0
            }

            maxOnes = maxOf(maxOnes, count)
        }

        return maxOnes
    }
}
