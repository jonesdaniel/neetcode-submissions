class ListNode(var `val`: Int) {
    var prev: ListNode? = null
    var next: ListNode? = null
}

class MyLinkedList() {
    private var head = ListNode(0)
    private var tail = ListNode(0)

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(index: Int): Int {
        var idx = index
        var cur = head.next
        while (cur != null && idx > 0) {
            cur = cur.next
            idx--
        }
        if (cur != null && cur != tail && idx == 0) {
            return cur.`val`
        }
        return -1
    }

    fun addAtHead(`val`: Int) {
        val node = ListNode(`val`)
        val next = head.next
        val prev = head
        prev.next = node
        next?.prev = node
        node.next = next
        node.prev = prev
    }

    fun addAtTail(`val`: Int) {
        val node = ListNode(`val`)
        val next = tail
        val prev = tail.prev
        prev?.next = node
        next.prev = node
        node.next = next
        node.prev = prev
    }

    fun addAtIndex(index: Int, `val`: Int) {
        var idx = index
        var cur = head.next
        while (cur != null && idx > 0) {
            cur = cur.next
            idx--
        }
        if (cur != null && idx == 0) {
            val node = ListNode(`val`)
            val next = cur
            val prev = cur.prev
            prev?.next = node
            next.prev = node
            node.next = next
            node.prev = prev
        }
        
    }

    fun deleteAtIndex(index: Int) {
        var idx = index
        var cur = head.next
        while (cur != null && idx > 0) {
            cur = cur.next
            idx--
        }
        if (cur != null && cur != tail && idx == 0) {
            val prev = cur.prev
            val next = cur.next
            prev?.next = next
            next?.prev = prev
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAthead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */