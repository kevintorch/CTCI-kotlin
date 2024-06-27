package Code_Library

/**
 * Like the TreeNode class,
 * we often needed access to the internals of a linked list in a way that the built-in linked list class wouldn't support.
 * For this reason, we implemented our own class and used it for many problems.
 *
 */

class LinkedListNode(var data: Int = 0) {

    var next: LinkedListNode? = null
    var prev: LinkedListNode? = null
    var last: LinkedListNode? = null

    constructor(data: Int, n: LinkedListNode?, p: LinkedListNode?) : this(data) {
        setNext(n)
        setPrevious(p)
    }

    fun setNext(n: LinkedListNode?) {
        next = n
        if (this == last) last = n
        if (n != null && n.prev != this) n.setPrevious(this)
    }

    fun setPrevious(p: LinkedListNode?) {
        prev = p
        if (p != null && p.next != this) p.setNext(this)
    }


}