class Solution {
    fun isPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1 // - 1 because it's an index

        while (start < end) {
            while (start < end && !s[start].isLetterOrDigit()) {
                start++
            }

            while (start < end && !s[end].isLetterOrDigit()) {
                end--
            }

            if (s[start].lowercaseChar() != s[end].lowercaseChar()) {
                return false
            }

            start++
            end--
        }

        return true
    }
}
