package Big_O.Examples_And_Excercises

import Code_Library.TreeNode

/**
 * The following simple code sums the values of all the nodes in a balanced binary search tree. What is its runtime?
 *
 * Just because it's a binary search tree doesn't mean that there is a log in it!
 * We can look at this two ways.
 *
 * 1. What It Means.
 *    This code touches each node in the tree once and does a constant time amount of work with each"touch" (excluding the recursive calls).
 *    Therefore, the runtime will be linear in terms of the number of nodes. If there are N nodes, then the runtime is O(N).
 *
 * 2. Recursive Pattern
 *    We said that the runtime of a recursive function with multiple branches is typically O(branchesᵈᵉᵖᵗʰ).
 *    There are two branches at each call, so we're looking at O(2ᵈᵉᵖᵗʰ).
 *
 *    We do have an exponential time algorithm, but it's not as bad as one might think.
 *    Consider what variable it's exponential with respect to.
 *
 *    What is depth? The tree is a balanced binary search tree. Therefore, if there are N total nodes, then depth is roughly log N.
 *
 *    By the equation above, we get O(2ˡᵒᵍ ᴺ) ==> O(N).
 *
 *
 */
private fun sum(node: TreeNode?) : Int {
    if (node == null) return 0
    return sum(node.left) + node.data + sum(node.right)
}