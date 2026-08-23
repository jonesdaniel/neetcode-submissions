/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var dummy = ListNode(0)
        var tail = dummy    

        var currentList1Node = list1
        var currentList2Node = list2

        // while there are more nodes in each list, 
        // compare the values of each of the nodes and pick the smallest.
        // and assign that to the next of the node we're on
        while (currentList1Node != null && currentList2Node != null) {
            if (currentList1Node.`val` < currentList2Node.`val`) {
                tail.next = currentList1Node
                currentList1Node = currentList1Node.next
            } else {
                tail.next = currentList2Node
                currentList2Node = currentList2Node.next
            }
            tail = tail.next!!
        }

        if (currentList1Node == null) {
            tail.next = currentList2Node
        } else if (currentList2Node == null) {
            tail.next = currentList1Node
        }

        return dummy.next
    }
}
