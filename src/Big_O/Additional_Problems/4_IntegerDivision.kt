package Big_O.Additional_Problems

/**
 * The following code performs integer division. What is its runtime (assume a and b are both positive)?
 *
 * O(a / b)
 *
 * The variable count will eventually equal a / b. The while loop iterates count times.
 * Therefore, it iterates a/b times.
 */
private fun div(a: Int, b: Int) : Int {
    var count = 0
    var sum = b
    while (sum <= a) {
        sum += b
        count++
    }
    return count
}