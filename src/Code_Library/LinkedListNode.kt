package Code_Library

/**
 * Like the TreeNode class,
 * we often needed access to the internals of a linked list in a way that the built-in linked list class wouldn't support.
 * For this reason, we implemented our own class and used it for many problems.
 *
 */

class LinkedListNode(var data: Int = 0) {
    var next: LinkedListNode? = null
        set(value) {
            field = value
            if (this == last) last = value
            if (value != null && value.prev != this) value.prev = this
        }
    var prev: LinkedListNode? = null
        set(value) {
            field = value
            if (value != null && value.next != this) value.next = this
        }
    var last: LinkedListNode? = null

    constructor(data: Int, n: LinkedListNode?, p: LinkedListNode?) : this(data) {
        next = n
        prev = p
    }
}