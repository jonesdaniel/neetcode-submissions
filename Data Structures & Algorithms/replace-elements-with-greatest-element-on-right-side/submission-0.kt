class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        var previousMax = -1

        for (i in arr.size - 1 downTo 0) {
            max = maxOf(previousMax, arr[i])
            arr[i] = previousMax
            previousMax = max
        }

        return arr
    }
}
