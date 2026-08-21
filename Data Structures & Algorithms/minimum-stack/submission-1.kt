class MinStack() {
    val stack = mutableListOf<Int>()
    val minimums = mutableListOf<Int>()

    fun push(value: Int) {
        stack.add(value)
        if (minimums.isEmpty() || value <= getMin()) {
            minimums.add(value)
        }
    }

    fun pop() {
        if (top() == getMin()) {
            minimums.removeAt(minimums.size - 1)
        }
        stack.removeAt(stack.size - 1)
    }

    fun top(): Int {
        return stack[stack.size - 1]
    }

    fun getMin(): Int {
        return minimums[minimums.size - 1]
    }
}
