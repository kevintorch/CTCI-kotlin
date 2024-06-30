package Big_O.Additional_Problems

/**
 * The following code computes a % b. What is its runtime?
 *
 * O(1). It does a constant amount of work.
 *
 */
private fun mod(a: Int, b: Int) : Int {
    if (b <= 0) return 1
    val div = a / b
    return a - div * b
}