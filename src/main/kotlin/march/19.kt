package march

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var result: ListNode? = ListNode(0)
    result?.next = head
    var fast = result
    var slow = result
    repeat(n + 1) {
        fast = fast?.next
    }

    while (fast != null) {
        fast = fast?.next
        slow = slow?.next
    }

    slow?.next = slow?.next?.next

    return result?.next
}