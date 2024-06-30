package Big_O.Additional_Problems

/**
 * The following code computes the product of a and b. What is its runtime?
 *
 * O(b). The for loop just iterates through b.
 *
 */
private fun product(a: Int, b: Int): Int {
    var sum = 0
    for (i in 0..<b) {
        sum += a
    }
    return sum
}