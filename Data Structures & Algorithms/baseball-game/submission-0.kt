class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()
        var totalPoints = 0

        for (operation in operations) {
            when (operation) {
                "C" -> { 
                    totalPoints -= stack[stack.size - 1]
                    stack.removeAt(stack.size - 1) 
                }
                "D" -> {
                    val points = stack[stack.size - 1] * 2
                    totalPoints += points
                    stack.add(points) 
                }
                "+" -> { 
                    val pointA = stack[stack.size - 1]
                    val pointB = stack[stack.size - 2]
                    totalPoints += (pointA + pointB)
                    stack.add(pointA + pointB)
                }
                else -> { 
                    totalPoints += operation.toInt()
                    stack.add(operation.toInt()) 
                }
            }
        }

        return totalPoints
    }
}
