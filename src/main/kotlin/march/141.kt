package march

fun hasCycle(head: ListNode?): Boolean {
    if (head == null) return false
    var slow = head
    var fast = head
    while (fast?.next?.next != null && slow?.next != null) {
        fast = fast.next?.next
        slow = slow.next
        if (fast == slow) return true
    }
    return false
}