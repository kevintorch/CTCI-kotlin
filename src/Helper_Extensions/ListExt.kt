package Helper_Extensions

import Code_Library.LinkedListNode

fun LinkedListNode.reverse(): LinkedListNode {
    val head = this
    val nxt = head.next
    head.next = null
    val n = nxt?.reverse()
    n?.appendToTail(head)
    return n ?: head
}

fun LinkedListNode.appendToTail(tail: LinkedListNode) {
    var n = this
    while (n.next != null) {
        n = n.next!!
    }
    n.next = tail
}