class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        var res = students.size
        
        // create a two position integer array that represents how many students want 0 or 1 sandwiches
        val cnt = IntArray(2)
        for (student in students) {
            cnt[student]++
        }

        // for each sandwich value in sandwiches
        for (s in sandwiches) {
            // if the number of students who want that sandwich is greater than zero
            if (cnt[s] > 0) {
                // "remove" that student from the "queue"
                cnt[s]--
                res--
            } else {
                break
            }
        }

        return res
    }   
}