/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var previous: ListNode? = null
        var current: ListNode? = head
        var next: ListNode? = current?.next

        while (current != null) {
            current.next = previous
            previous = current
            
            if (next == null) {
                break
            }
            current = next
            next = current.next
        }

        return current
    }
}
