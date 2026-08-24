class Deque {

    data class ListNode(
        var value: Int,
        var next: ListNode? = null,
        var prev: ListNode? = null
    )

    var head: ListNode? = null
    var tail: ListNode? = null

    fun isEmpty(): Boolean {
        return head == null && tail == null
    }

    fun append(value: Int) {
        val newNode = ListNode(value = value)
        if (isEmpty()) {
            head = newNode
            tail = newNode
        } else {
            tail!!.next = newNode
            newNode.prev = tail
            tail = newNode
        }
    }

    fun appendleft(value: Int) {
        if (isEmpty()) {
            append(value)
        } else {
            val newNode = ListNode(value = value)
            head!!.prev = newNode
            newNode.next = head
            head = newNode
        }
    }

    fun pop(): Int {
        return if (isEmpty()) {
            -1
        } else {
            if (head == tail) {
                val result = head!!.value
                head = null
                tail = null
                result
            } else {
                val oldTail = tail
                val prev = tail!!.prev
                tail = prev
                oldTail!!.value
            }
        }
    }

    fun popleft(): Int {
        return if (isEmpty()) {
            -1
        } else {
            if (head == tail) {
                val result = head!!.value
                head = null
                tail = null
                result
            } else {
                val oldHead = head
                val next = head!!.next
                head = next
                oldHead!!.value
            }
        }
    }
}
