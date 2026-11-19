class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()

        for ((i, n) in nums.withIndex()) {
            val diff = target - n
            if (hashMap.containsKey(diff)) {
                return intArrayOf(hashMap[diff]!!, i)
            } else {
                hashMap[n] = i
            }
        }

        return intArrayOf()
    }
}