package Code_Library

/**
 * While it's perfectly fine-even good-to use the built-in binary tree class when possible, it's not always possible.
 * In many questions, we needed access to the internals of the node or tree class (or needed to tweak these)
 * and thus couldn't use the built-in libraries.
 *
 * The TreeNode class supports a variety of functionality, much of which we wouldn't necessarily want for every question/solution.
 * For example, the TreeNode class tracks the parent of the node, even though we often don't use it (or specifically ban using it).
 */

class TreeNode(var data: Int = 0) {

    var left: TreeNode? = null
    var right: TreeNode? = null
    var parent: TreeNode? = null

    private var size = 0

    fun insertInOrder(d: Int = 0) {
        if (d <= data) {
            if (left == null) {
                setLeftChild(TreeNode(d))
            } else {
                left!!.insertInOrder(d)
            }
        } else {
            if (right == null) {
                setRightChild(TreeNode(d))
            } else {
                right!!.insertInOrder(d)
            }
        }
        size++
    }

    fun size() = size

    fun find(d: Int) : TreeNode? {
        if (d == data) return this
        if (d <= data) return if (left != null) left!!.find(d) else null
        return if (right != null) right!!.find(d) else null
    }

    fun setLeftChild(left: TreeNode?) {
        this.left = left
        if (left != null) {
            left.parent = this
        }
    }

    fun setRightChild(right: TreeNode?) {
        this.right = right
        if (right != null) {
            right.parent = this
        }
    }
}