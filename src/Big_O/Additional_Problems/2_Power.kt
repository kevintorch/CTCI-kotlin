package Big_O.Additional_Problems

/**
 * The following code computes aᵇ. What is its runtime?
 *
 * O(b). The recursive code iterates through b calls,since it subtracts one at each level.
 *
 */
private fun power(a: Int, b: Int) : Int {
    if (b < 0) return 0
    if (b == 0) return 1
    return a * power(a, b - 1)
}