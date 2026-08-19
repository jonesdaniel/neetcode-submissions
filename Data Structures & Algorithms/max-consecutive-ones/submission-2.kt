class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxOnes = 0
        var count = 0

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
