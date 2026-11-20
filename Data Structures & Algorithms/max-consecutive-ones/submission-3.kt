class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var maxOnes = 0
        var currentMaxOnes = 0

        for (num in nums) {
            if (num == 1) {
                currentMaxOnes++
                if (maxOnes < currentMaxOnes) {
                    maxOnes = currentMaxOnes
                }
            } else {
                currentMaxOnes = 0
            }
        }

        return maxOnes
    }
}
